package PrepDSA.Recurssion;

import static java.lang.Math.max;

/**
 * @author: sonali.shakya
 */
public class houseRobbing {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 1};
        System.out.println(maxRobbery(a, 0));
    }

    static int maxRobbery(int[] a, int i) {

        if (i >= a.length)
            return 0;

        int sum1 = a[i] + maxRobbery(a, i+2);
        int sum2 = maxRobbery(a, i+1);

        return max(sum1, sum2);

    }
}
