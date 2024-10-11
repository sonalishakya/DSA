package PrepDSA.NewRandom;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 8, 10, 13, 27};

        divide(arr, 0, arr.length, 27);
    }

    static void divide(int[] arr, int s, int e, int n){
        if (s >= e) {
            System.out.println("Value not found");
            return;
        }

        // calculate mid
        // compare with m
        // chose next slot according to the value
        int m = s + (e - s) / 2 ;

        if (arr[m] == n) {
            System.out.println("found at " + m);
        } else if (arr[m] < n) {
            divide(arr, m +1, e, n);
        } else {
            divide(arr, s , m - 1, n);
        }
    }
}
