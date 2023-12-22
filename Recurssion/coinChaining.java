package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */

public class coinChaining {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int sum = 5;

        System.out.println(minimumElements(a, sum));
    }

    static int minimumElements(int[] a, int sum) {
        if (sum == 0) {
            return 0;
        }
        if (sum < 0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < a.length; j++) {
            int ans = minimumElements(a, sum-a[j]);
            if (ans != Integer.MAX_VALUE)
                min = Integer.min(ans+1, min);
        }
        return min;
    }
}
