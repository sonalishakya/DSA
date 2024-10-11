package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class fibonacciRE {
    public static void main(String[] args) {
        int n = 50;

//        System.out.println(recursiveFibonacci(n));
        recur(0, 1, 2, n);
    }

//    static int recursiveFibonacci(int n) {
//
//        if (n == 0 || n == 1)
//            return n;
//        int ans = recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
//        return ans;
//
//    }

    static void recur(int a, int  b, int i, int n) {
        if (i == n) {
            System.out.println(a+b);
            return;
        }
        System.out.println(a+b);
        recur(b, a+b, i+1, n);
    }
}
