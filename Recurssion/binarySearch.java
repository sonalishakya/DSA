package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 6, 8, 9, 10};
        int target = 100;
        System.out.println(recurringBinary(a, 0, a.length-1, target));
    }

    static int recurringBinary(int[] a, int start, int end, int target) {
        int mid = start + (end - start)/2;

        if (start > end)
            return -1;
        if (a[mid] == target)
            return mid;
        if (a[mid] >= target) {
            return recurringBinary(a, start, mid-1, target);
        } else
            return recurringBinary(a, mid+1, end, target);
    }
}
