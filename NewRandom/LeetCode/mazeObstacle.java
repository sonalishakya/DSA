package PrepDSA.NewRandom.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class mazeObstacle {
    static boolean[][] arr = { {true, false, true},
            {true, true, true},
            {true, true, true}};
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        int n = 3;
//        System.out.println(pathCount(0, 0, n-1));
        pathPrint(0, 0, n-1, "");
        System.out.println(result);
    }

    static int pathCount(int i, int j, int n) {
        if (i == n && j == n)
            return 1;
        int right = 0, down = 0;
        if (i < n && arr[i+1][j])
            right = pathCount(i+1, j, n);
        if (j < n && arr[i][j+1])
            down = pathCount(i, j+1, n);
        return right+down;
    }

    static void pathPrint(int i , int j, int n, String combo) {
        if (i == n && j == n) {
            result.add(combo);
        }

        if (i < n && j < n && arr[i+1][j] && arr[i][j+1])
            pathPrint(i+1, j+1, n, combo + "S");
        if (i < n && arr[i+1][j])
            pathPrint(i+1, j, n, combo+"D");
        if (j < n && arr[i][j+1])
            pathPrint(i, j+1, n, combo+"R");
    }
}
