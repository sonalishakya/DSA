package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class climbStairs {
    public static void main(String[] args) {
        int n = 4;
        //O(2^n)
        System.out.println(climbRE(n));
    }

    static int climbRE(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2)
            return 2;
        return climbRE(n-1) + climbRE(n-2);
    }
}
