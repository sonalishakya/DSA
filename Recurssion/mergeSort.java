package PrepDSA.Recurssion;

import java.util.Arrays;

/**
 * @author: sonali.shakya
 */
public class mergeSort {
    public static void main(String[] args) {
        int[] a = {5, 7, 34,1 ,3,2, 4, 1, 6, 9, 4};
        divide(a, 0, a.length-1);
        for (int i = 0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void divide(int[] a, int s, int e) {
        if (s >= e)
            return;
        int mid = (s+e)/2;
        divide(a, s, mid);
        divide(a, mid+1, e);
        merge(a, s, e);
    }

    static void merge(int[] c, int s, int e) {
        int mid = (s+e)/2; //0
        int[] a = Arrays.copyOfRange(c, s, mid+1);
        int[] b = Arrays.copyOfRange(c, mid+1, e+1);

        int a_index = 0, b_index = 0, c_index = s;
        while (a_index < a.length && b_index < b.length) {
            if (a[a_index] < b[b_index]) {
                c[c_index++] = a[a_index++];
            } else {
                c[c_index++] = b[b_index++];
            }
        }
        while (a_index < a.length)
            c[c_index++] = a[a_index++];

        while (b_index < b.length)
            c[c_index++] = b[b_index++];
    }
}
