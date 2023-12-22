package PrepDSA.Backtracking.Assignment;

/**
 * @author: sonali.shakya
 */
public class quickSortEnd {
    public static void main(String[] args) {
        int[] a = {4, 1, 3, 9, 7};
        solve(a, 0, a.length-1);

        for (int i = 0 ; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void solve(int[] a, int s, int e) {
        if (s >= e) {
            return;
        }
        int pivot = e;
        int i = s-1, j = s, temp = 0;
        while (j <= pivot) {
            if (a[j] < a[pivot]) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j++;
        }
        i++;
        temp = a[i];
        a[i] = a[pivot];
        a[pivot] = temp;
        solve(a, s, i-1);
        solve(a, i+1, e);

    }
}
