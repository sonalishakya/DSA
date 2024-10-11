package PrepDSA.NewRandom;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3};
//        System.out.println(Arrays.toString(divide(arr, 0, arr.length-1)));
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void divide(int[] arr, int s, int e) {
        if (e - s  == 1) {
            return;
        }

        int m = s + (e - s)/2;
        divide(arr, s, m);
        divide(arr, m, e);
        sortAndMerge(arr, s, m, e);
    }

    static int[] sortAndMerge(int[] arr, int s, int m, int e) {
        int[] merged = new int[e-s];
        int i = 0, a = s, b = m, c = e;
        while (a < m && b < e) {
            if (arr[s] < arr[m]) {
                merged[i] = arr[a];
                i++; a++;
            } else {
                merged[i] = arr[b];
                i++; b++;
            }
        }
        while (a < m) {
            merged[i] = arr[a];
            i++; a++;
        }
        while (b < e) {
            merged[i] = arr[b];
            i++; b++;
        }

        for (int l = 0; l < merged.length; l++) {
            arr[s+l] = merged[l];
        }
        System.out.println(Arrays.toString(merged));
        return arr;
    }
}
