package PrepDSA.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
public class nQueenProblem {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] cantVisit = new boolean[n][n];
        List<List<String>> solution = new ArrayList<>();
        solve(0, n, cantVisit, solution);
        for (List<String> s : solution)
            System.out.println(s);


    }
    static void solve(int i, int rows, boolean[][] cantVisit, List<List<String>> solution) {
        int qCount = 0;
        List<String> pattern = new ArrayList<>();
        if (i >= rows) {
            return;
        }
        complimentForQueen(i, 0, rows, cantVisit, true);
        cantVisit[i][0] = false;
        Map<Integer, Integer> dim = new HashMap<>();
        for (int x = 0; x < rows; x++) {
            String output = "";
            for (int y = 0; y < rows; y++) {
                if (!cantVisit[x][y]) {
                    output = output + "Q";
                    qCount += 1;
                    dim.put(x,y);
                    complimentForQueen(x, y, rows, cantVisit, true);
                } else {
                    output = output + ".";
                }
            }
            pattern.add(output);
        }

        if (qCount == rows) {
            solution.add(pattern);
        }
        for (Map.Entry<Integer, Integer> x : dim.entrySet()) {
            complimentForQueen(x.getKey(), x.getValue(), rows, cantVisit, false);
        }
        solve(i+1, rows, cantVisit, solution);
        initializeByZero(cantVisit, rows);
    }

    static void complimentForQueen(int i, int j, int rows, boolean[][] cantVisit, boolean value) {
       for (int l = 0; l < rows; l++) {
           if (i>=0 && i<=rows && j>=0 && j<=rows) {
               cantVisit[i][l] = value;
               cantVisit[l][j] = value;
               if (i-l >= 0 && j-l >= 0)
                    cantVisit[i-l][j-l] = value;
               if (i+l < rows && j+l < rows)
                   cantVisit[i+l][j+l] = value;
               if (i-l >= 0 && j+l < rows)
                   cantVisit[i-l][j+l] = value;
               if (j-l >= 0 && i+l < rows)
                   cantVisit[i+l][j-l] = value;
           }
       }
    }

    static void initializeByZero(boolean[][] cantVisit, int n) {
        for (int i = 0 ; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                cantVisit[i][j] = false;
            }
        }
    }
}
