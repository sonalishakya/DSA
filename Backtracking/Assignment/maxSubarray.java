package PrepDSA.Backtracking.Assignment;

/**
 * @author: sonali.shakya
 */
public class maxSubarray {
    public static void main(String[] args) {
        int[] a = {5,4,-1,7,8};
        System.out.println(solve(a, 0, a.length-1));
    }

    static public int solve(int[] a, int s, int e) {
        if (s == e) {
            return a[s];
        }
        int maxLeft = Integer.MIN_VALUE, maxRight = Integer.MIN_VALUE;
        int m = s + (e-s)/2;
        int left = solve(a, s, m);
        int right = solve(a, m+1, e);
        int sumLeft = 0, sumRight = 0;

        for (int i = m; i >= s; i--) {
            sumLeft = sumLeft + a[i];
            maxLeft = Math.max(maxLeft, sumLeft);
        }

        for (int i = m+1; i <= e; i++) {
            sumRight = sumRight + a[i];
            maxRight = Math.max(maxRight, sumRight);
        }
        int sumMid = maxLeft + maxRight;
        return  Math.max(sumMid, Math.max(left, right));

    }
}
