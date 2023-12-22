package PrepDSA.Backtracking.Assignment;

/**
 * @author: sonali.shakya
 */

 public class inPlaceMergeSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 9, 12, 13};
        int[] b = {3, 4, 7, 10};
        solve(a, b, a.length+b.length);

        for (int i = 0 ; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0 ; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    static void solve(int[] a, int[] b, int gap) {
        if (gap <= 1) {
            return;
        }
        gap = gap/2 + gap%2;
        System.out.println(gap);
        int i = 0, temp = 0;
        int j = gap;
        while (j < a.length + b.length-2) {
            if (j >= a.length) {
                if (a[i] >= b[j - a.length]) {
                    temp = a[i];
                    a[i] = b[j - a.length];
                    b[j - a.length] = temp;
                }
            } else {
                if (a[i] >= a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            i++; j++;
        }
        solve(a, b, gap);
    }

}
