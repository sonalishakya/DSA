package PrepDSA.NewRandom.LeetCode;

import java.util.Arrays;
import java.util.List;

public class nKnights {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        display(board);
        Integer[] a = {1, 2, 3};
        List<Integer> b = Arrays.asList(a);
        System.out.println(b);
//        knights(0, board);
    }

    static void knights(int row, char[][] board, int k) {
        if (row == board.length) {
            display(board);
            return;
        }

        for (int col = 0 ; col < board.length; col++) {
            if (canPlace(row, col, board)) {
                board[row][col] = 'K';
                knights(row+1, board, k+1);
                board[row][col] = '.';
            }

        }
    }

    static boolean canPlace(int row, int col, char[][] board) {
        if (row > 1 && (col > 0 || col < board.length-2))
            return true;
        if (row < board.length-2 && (col > 0 || col < board.length-2))
            return true;
        if (col > 1 && (row > 0 || row < board.length-2))
            return true;
        if (col < board.length-2 && (row > 0 || row < board.length-2))
            return true;

        return false;
    }

    static void display(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
