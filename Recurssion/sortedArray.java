package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class sortedArray {
    public static void main(String[] args) {
        int[] a = {4, 3, 1, 2, 4, 4};
        System.out.println(isSorted(a, a.length, 1));
    }

    static boolean isSorted(int[] a, int n, int i) {
        if (i >= n)
            return true;

        if (a[i] > a[i-1]) {
            System.out.println(a[i] +" "+ a[i-1]);
            return isSorted(a, n, i+1);
        } else
            return false;
    }
}
