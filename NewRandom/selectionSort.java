package PrepDSA.NewRandom;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 2, 2, 2, 4, 1, 9, 0};
        sort(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int colIndex, int rowIndex, int minElementIndex) {
        if (rowIndex == arr.length-1)
            return;

        if (colIndex <= arr.length-1) {
            if (arr[minElementIndex] > arr[colIndex])
                sort(arr, colIndex + 1, rowIndex, colIndex);
            else
                sort(arr, colIndex + 1, rowIndex, minElementIndex);
        } else {
            // swap min with rowIndex
//            System.out.print(arr[rowIndex] + " ");
//            System.out.println(arr[minElementIndex]);
            int temp = arr[minElementIndex];
            arr[minElementIndex] = arr[rowIndex];
            arr[rowIndex] = temp;

            sort(arr, rowIndex + 1, rowIndex+1, rowIndex + 1);
        }

    }
}
