package PrepDSA.Backtracking;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
public class sudokuSolverIDK {

    public static void main(String[] args) {
        char[][] sudoku = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        int n = sudoku.length;
        solve(sudoku, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }

    }

        static boolean solve(char[][] ch, int n) {
            boolean valid = false;
            for (int i = 0 ; i < n; i++){
                for (int j = 0 ; j < n ; j++) {
                    if (ch[i][j] == '.') {
                        for (int k = 1; k <= n; k++) {
                            if (isSafe(ch, i, j, n, (char) (k + '0'))) {
                                ch[i][j] = (char) (k + '0');
                                valid = solve(ch, n);
                                if (valid) {
                                    return true;
                                }
                                ch[i][j] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        static boolean isSafe(char[][] ch, int i , int j , int n, char k) {

            for (int a = 0 ;a < j; a++) {
                if (ch[i][a] == k)
                    return false;
            }

            for (int a = 0; a < i; a++) {
                if (ch[a][j] == k)
                    return false;
            }

            for (int a = 0; a < n; a++) {
                if (ch[3*(i/3) + (a/3)][3*(j/3) + (a%3)] == k)
                    return false;
            }
            return true;
        }
}

//    static boolean solve(char[][] sudoku, int n) {
//        boolean valid = false;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0 ; j < n; j++) {
//                if (sudoku[i][j] == '.') {
//                    for (int k = 1 ; k <= n; k++) {
//                        if (isSafe(sudoku, i, j, n, (char) (k + '0'))) {
//                            sudoku[i][j] = (char) (k + '0');
//                            valid = solve(sudoku, n);
//                            if (valid) {
//                                return true;
//                            }
//                            sudoku[i][j] = '.';
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    static boolean isSafe(char[][] sudoku, int rows, int col, int n, char ch) {
//        for (int i = 0; i< n; i++) {
//            if (sudoku[rows][i] == ch)
//                return false;
//            if (sudoku[i][col] == ch)
//                return false;
//        }
//        for (int a = 0; a < n; a++) {
//            if (sudoku[3*(rows/3) + (a/3)][3*(col/3) + (a%3)] == ch)
//                return false;
//        }
//        return true;
//    }
//
//
//    static void printingSudoku(char[][] sudoku, int n) {
//        for (int i = 0 ; i < n; i++) {
//            for (int j = 0 ; j < n; j++) {
//                System.out.print(sudoku[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

