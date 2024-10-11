package PrepDSA.NewRandom;

public class rotatedBinary {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 1, 2, 3};
        int n = 2;
        System.out.println(search(arr, n, 0, arr.length -1));
    }

    static int search(int[] arr, int n, int s, int e) {
        if (s > e)
            return -1;
        int m = s + (e-s)/2;
        if (arr[m] == n)
            return m;

        if (arr[s] <= arr[m]) {
            if (n >= arr[s] && n <= arr[m])
                return search(arr, n, s, m-1);
            else
                return search(arr, n, m+1, e);
        }
        if (n >= arr[m] && n <= arr[e])
            return search(arr, n, m+1, e);
        return search(arr, n, s, m-1);



//        if (arr[s] < n && arr[m] > n)
//            search(arr, n, s, m-1);
//        else if (arr)
    }
}
