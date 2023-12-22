package PrepDSA.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
public class nQueenProblemV2 {
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        List<List<String>> sol = new ArrayList<>();
        Map<Integer, Boolean> upperRight = new HashMap<>();
        Map<Integer, Boolean> upperRow= new HashMap<>();
        Map<Integer, Boolean> upperLeft = new HashMap<>();
        placingQueen(0, n, board, sol, upperRight, upperRow, upperLeft);
        //   0 1 2 3

        //0  Q 0 0 0
        //1  0 0 Q 0
        //2  0 0 0 0
        //3  0 0 0 0

        //iterate rows through 'i' using recursion and cols through 'j' using iterations
        //place q if it is safe to and recur for the next line's q

        for (List<String> s : sol)
            System.out.println(s);
    }

    static void placingQueen(int row, int n, char[][] board, List<List<String>> sol, Map<Integer, Boolean> upperRight, Map<Integer, Boolean> upperRow, Map<Integer, Boolean> upperLeft) {
        if (row >= n) {
            savePattern(board, sol);
            return;
        }

        for (int col = 0; col < n; col++) {
//            if (isSafe(row, col, n, board)) {
            if (isSafe(row, col, n, upperRight, upperRow, upperLeft)) {

                board[row][col] = 'Q';
                upperRight.put(row+col, true);
                upperRow.put(col, true);
                upperLeft.put(row-col+n-1, true);

                placingQueen(row+1, n, board, sol, upperRight, upperRow, upperLeft);

                board[row][col] = '.';
                upperRight.remove(row+col);
                upperRow.remove(col);
                upperLeft.remove(row-col+n-1);
            }
        }
    }

    static void savePattern(char[][] board, List<List<String>> sol) {
        List<String> s = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s1 = "";
            for (int j = 0 ; j < board.length ; j++) {
                if (board[i][j] == '\0')
                    s1 = s1 + ".";
                else
                    s1 = s1 + board[i][j];
            }
            s.add(s1);
        }
        sol.add(s);
    }

    static boolean isSafe(int row, int col, int n, char[][] board) {
        int i = row;
        int j = col;
        //top rows
        while (i >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
        }
        i = row;
        //upper Left
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        i = row;
        j = col;
        // upper Right
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    static boolean isSafe(int row, int col, int n, Map<Integer, Boolean> upperRight, Map<Integer, Boolean> upperRow, Map<Integer, Boolean> upperLeft) {
        if (upperRight.containsKey(row+col))
            return false;

        if (upperLeft.containsKey(row-col+n-1))
            return false;

        if (upperRow.containsKey(col))
            return false;

        return true;
    }
}
