package PrepDSA.NewRandom;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 1, 2};

        // 2, *3*, 1, 4
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int pivot = s + (e-s)/2;

//        System.out.println(arr[s] + " " + arr[pivot] + " " + arr[e]);

        while (s <= e) {

//            System.out.println(arr[s] + " " + arr[pivot] + " " + arr[e]);
            while (arr[s] < arr[pivot])
                s++;
            while (arr[e] > arr[pivot])
                e--;

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }

//        System.out.println(Arrays.toString(arr));


        sort(arr, low, e);
        sort(arr, s, high);
    }
}
