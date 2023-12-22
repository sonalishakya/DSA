package PrepDSA.Backtracking;

/**
 * @author: sonali.shakya
 */
public class sudokuSolver {
    public static void main(String[] args) {
        char[][] sudoku = { {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'} };

        solve(sudoku, sudoku.length);

        printingSudoku(sudoku, sudoku.length);

    }

    static boolean solve(char[][] sudoku, int n) {
        boolean valid = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sudoku[i][j] == '.') {
                    for (int k = 1; k <= n; k++) {
                        if (isSafe(sudoku, i, j, n, (char) (k + '0'))) {
                            sudoku[i][j] = (char) (k + '0');
                            valid = solve(sudoku, n);
                            if (valid)
                                return true;
                            sudoku[i][j] = '.';
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSafe(char[][] sudoku, int i, int j, int n, char k) {
        for (int a = 0; a < j; a++) {
            if (sudoku[i][a] == k)
                return false;
        }
        for (int a = 0; a < i; a++) {
            if (sudoku[a][j] == k)
                return false;
        }
        for (int a = 0; a < n; a++) {
            if (sudoku[3*(i/3) + (a/3)][3*(j/3) + (a%3)] == k)
                return false;
        }
        return true;
    }

    static void printingSudoku(char[][] sudoku, int n) {
        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
