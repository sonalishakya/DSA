package PrepDSA.Backtracking.Assignment;

/**
 * @author: sonali.shakya
 */
public class inversionCount_sorting {
    public static void main(String[] args) {
        int[] num = {1,0,2};
        int n = 3;

        int[] temp = new int[n];
        System.out.println(solveLocal(num, n));
        System.out.println(solve(num, 0, num.length-1, temp));

    }

    static int solve(int[] num, int start, int end, int[] temp) {
        if (start >= end) {
            return 0;
        }
        int count  = 0;
        int mid = start + (end-start)/2;
        count += solve(num, start, mid, temp);
        count += solve(num, mid+1, end, temp);
        count += merge(num, start, mid, end, temp);
        return count;
    }

    static int merge(int[] num, int start, int mid, int end, int[] temp) {
        int count = 0;
        int s = start;
        int m = mid + 1;
        int k = start;
        while (s<=mid && m<=end) {
            if (num[s] <= num[m]) {
                temp[k++] = num[s++];
            } else {
                temp[k++] = num[m++];
                count += mid - s + 1;
            }
        }
        while (s<=mid) {
            temp[k++] = num[s++];
        }
        while (m<=end) {
            temp[k++] = num[m++];
        }
        while (start <= end) {
            num[start] = temp[start];
            start++;
        }
        return count;
    }

    static int solveLocal(int[] num, int n) {
        int count = 0;
        for (int i = 0 ; i < n-1; i++) {
            if (num[i] > num[i+1])
                count++;
        }
        return count;
    }
}