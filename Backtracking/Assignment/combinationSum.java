package PrepDSA.Backtracking.Assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class combinationSum {
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        combine(a, target, finalList, output, 0);

        for (List<Integer> list : finalList)
            System.out.print(list + " ");

    }

    static void combine(int[] a, int target, List<List<Integer>> finalList, List<Integer> output, int index) {
        if (target == 0) {
            finalList.add(new ArrayList<>(output));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index ; i < a.length; i++) {
            output.add(a[i]);
            combine(a, target-a[i], finalList, output, i);
            output.remove(output.size()-1);
        }
    }
}

