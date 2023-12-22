package PrepDSA.Backtracking.Assignment;

/**
 * @author: sonali.shakya
 */
public class inPlaceSingleArray {
    public static void main (String[] args) {
        int[] v = {1, 2, 8, 9, 12, 13, 3, 4, 7, 10};
        int n = 10;

        solve(v, n);

        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }

    }

    static void solve(int[] v, int gap) {
        if (gap <= 1) {
            return;
        }
        gap = gap/2 + gap%2;
        int i = 0;
        int j = i + gap;
        int temp = 0;
        while (j < v.length) {
            if (v[i] > v[j]) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
            i++; j++;
        }
        solve(v, gap);
    }
}
