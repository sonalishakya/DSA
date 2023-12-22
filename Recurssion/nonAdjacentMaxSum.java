package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
//WRONG
public class nonAdjacentMaxSum {
    int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] a = {2, 1, 4, 9};

        solve(a, 0, 0, Integer.MIN_VALUE);
    }

    static void solve(int[] a, int i, int sum, int max) {
        if (i >= a.length){
            max = Integer.max(sum, max);
            System.out.println(max);
            return;
        }
        //include
        solve(a, i+2, sum+a[i], max);
        //exclude
        solve(a, i+1, sum, max);
    }
}
