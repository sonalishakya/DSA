package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class cutSegments {
    public static void main(String[] args) {
        int[] a = {1, 2, 2};
        int N = 8;

        System.out.println(maxSegment(a, N));
    }

    static int maxSegment(int[] a, int N) {
        if (N == 0)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (N - a[i] >= 0) {
                int ans = maxSegment(a, N-a[i]);
                max = Integer.max(ans+1, max);
            }
        }
        return max;
    }
}
