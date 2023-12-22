package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class countArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        count(a, a.length, 0);
    }

    static void count(int[] a, int n, int i) {
        if (i == n) {
            return;
        }
        System.out.println(a[i]);
        count(a, n, i+1);
    }
}
