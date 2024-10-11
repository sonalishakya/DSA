package PrepDSA.NewRandom.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class fourPaths {
    static int n = 3;
    static boolean[][] visited = {{false, false, false},
            {false, false, false},
            {false, false, false}};
    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        paths(0, 0, "", results);
        System.out.println(results);
    }

    //R, L, U, D
    static void paths(int i, int j, String combo, List<String> result) {
        if (i == n-1 &&  j == n-1) {
            result.add(combo);
            return;
        }

        if (i < n-1 && !visited[i+1][j]) {
            visited[i+1][j] = true;
            paths(i+1, j, combo+"D", result);
            visited[i+1][j] = false;
        }
        if (j < n-1 && !visited[i][j+1]) {
            visited[i][j+1] = true;
            paths(i, j+1, combo+"R", result);
            visited[i][j+1] = false;
        }
        if (i > 0 && !visited[i-1][j]) {
            visited[i-1][j] = true;
            paths(i-1, j, combo+"U", result);
            visited[i-1][j] = false;
        }
        if (j > 0 && !visited[i][j-1]) {
            visited[i][j-1] = true;
            paths(i, j-1, combo+"L", result);
            visited[i][j-1] = false;
        }
    }
}
