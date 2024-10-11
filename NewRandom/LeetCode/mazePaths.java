package PrepDSA.NewRandom.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class mazePaths {
    public static void main(String[] args) {
        //matrix - 3X3
        int n = 3;
//        System.out.println(pathCalc(3, 3));
        List<String> result = new ArrayList<>();
        pathPrint("", 3, 3, result);
        System.out.println(result);
    }

    static int pathCalc(int i, int j) {
        if (i == 1 || j == 1)
            return 1;
        return pathCalc(i, j-1) + pathCalc(i-1, j);
    }

    static void pathPrint(String combo, int i, int j, List<String> result) {
        if (i == 1 && j == 1) {
            result.add(combo);
            return;
        }
        if (i > 1 && j > 1)
            pathPrint(combo + "S", i-1, j-1, result);
        if (i > 1)
            pathPrint(combo + "R", i-1, j, result);
        if (j > 1)
            pathPrint(combo + "D", i, j-1, result);
    }
}
