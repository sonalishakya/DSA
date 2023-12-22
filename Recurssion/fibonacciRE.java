package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class fibonacciRE {
    public static void main(String[] args) {
        int n = 7;

        System.out.println(recursiveFibonacci(n));
    }

    static int recursiveFibonacci(int n) {

        if (n == 0 || n == 1)
            return n;
        int ans = recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
        return ans;

    }
}
