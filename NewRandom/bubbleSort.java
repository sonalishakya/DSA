package PrepDSA.NewRandom;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 7, 3, 4, 1, 6};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col) {
        if (row == 0)
            return;

        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            sort(arr, row, col + 1);
        } else
            sort(arr, row - 1, 0);
    }

    static void swap(int[] arr, int min, int n) {
        int temp = min;
        arr[min] = arr[n];
        arr[n] = arr[temp];
    }
}
