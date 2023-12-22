package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 5, 5, 2, 20, 50, 30};
        solve(arr, 0, arr.length - 1);
        for (int i = 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void solve(int[] arr, int s, int e) {
        if (s >= e)
            return;
        // 1, 3, 2, 8, 20, 50, 30
        int pivot = partition(arr, s, e);

        solve(arr, s, pivot-1);
        solve(arr, pivot+1, e);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot = s;
        int count = 0;
        for (int i = s +1; i <= e; i++) {
            if (arr[i] < arr[pivot])
                count++;
        }
        pivot = s +count;
        swap(arr, s, pivot);

        int i = s;
        int j = e;

        while (i < pivot && j > pivot) {
            while (arr[i] < arr[pivot])
                i++;
            while (arr[j] > arr[pivot])
                j--;

            if (i < pivot && j > pivot)
                swap(arr, i, j);
        }
        return pivot;
    }

    static void swap(int[] arr, int s, int pivot) {
        int temp = arr[s];
        arr[s] = arr[pivot];
        arr[pivot] = temp;
    }
}
