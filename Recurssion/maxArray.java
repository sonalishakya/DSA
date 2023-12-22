package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class maxArray {
    public static void main(String[] args) {
        int[] a = {5, 7, 9, 71, 3, 6, 31};
        System.out.println(maxInArray(a, a.length, 0, Integer.MIN_VALUE));

    }

    static int maxInArray(int[] a, int n, int i, int max) {
        if (i >= n) {
            return max;
        }
        if (max < a[i])
            max = a[i];

        return maxInArray(a, n, i+1, max);
    }
}
