package PrepDSA.Backtracking.Assignment;

/**
 * @author: sonali.shakya
 */

//You are given an integer array nums of length n which represents a permutation of all the integers in the range [0, n - 1].

//The number of global inversions is the number of the different pairs (i, j) where:
//0 <= i < j < n
//nums[i] > nums[j]

//The number of local inversions is the number of indices i where:
//0 <= i < n - 1
//nums[i] > nums[i + 1]

//Return true if the number of global inversions is equal to the number of local inversions.


public class inversionCount {
    public static void main(String[] args) {
        int[] num = {1, 2, 0};
        int n = 3;
        int global = solveGlobal(num, n, 0, 0);
        int local = solveLocal(num, n);

        if (global == local)
            System.out.println("True");
    }

    static int solveGlobal(int[] num, int n, int k, int count) {
        if (k == n) {
            System.out.println(count);
            return count;
        }

        for (int i = k+1 ; i < n; i++) {
            if (num[k] > num[i])
                count++;
        }
        return solveGlobal(num, n, k+1, count);
    }

    static int solveLocal(int[] num, int n) {
        int count = 0;
        for (int i = 0 ; i < n-1; i++) {
            if (num[i] > num[i+1])
                count++;
        }
        System.out.println(count);
        return count;
    }
}
