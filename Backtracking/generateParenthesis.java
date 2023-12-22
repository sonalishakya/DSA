package PrepDSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */

public class generateParenthesis {
    public static void main(String[] args) {
        int n = 2;
        List<String> solution = new ArrayList<>();
        parenthesis(n, n, "", solution);
        System.out.println(solution.size());
    }

    static void parenthesis(int open, int close, String output, List<String> solution) {
        if (open == 0 && close == 0) {
            System.out.println(output);
            solution.add(output);
            return;
        }

        if (open >= 0)
            parenthesis(open-1, close, output+"(", solution);
        if (open < close)
            parenthesis(open, close-1, output+")", solution);
    }
}
