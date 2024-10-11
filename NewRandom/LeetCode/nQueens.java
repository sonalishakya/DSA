package PrepDSA.NewRandom.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class nQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
//        display(board);
        queenPosition(board, 0);
    }

    static void queenPosition(char[][] board, int row) {
        if (row == board.length) {
            display(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (canPlace(row, col, board)) {
                board[row][col] = 'Q';
                queenPosition(board, row+1);
                board[row][col] = '.';
            }
        }
    }

    static boolean canPlace(int row, int col, char[][] board) {
        for (int i = 0; i <= row; i++) {
            if (board[row-i][col] == 'Q')
                return false;
        }

        int len = Math.min(row, col);
        for (int i = 0; i <= len; i++) {
            if (board[row-i][col-i] == 'Q')
                return false;
        }

        len = Math.min(row, board.length-1-col);
        for (int i = 0; i <= len; i++) {
            if (board[row-i][col+i] == 'Q')
                return false;
        }

        return true;
    }

    static void display(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }


}
