package PrepDSA.NewRandom;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 8, 9, 10};
        int n = 57;

        System.out.println(search(arr, n, 0));
    }

    static boolean search(int[] arr, int n, int i) {
        if (i == arr.length)
            return false;

        return (arr[i] == n) || search(arr, n, i+1);
    }
}
