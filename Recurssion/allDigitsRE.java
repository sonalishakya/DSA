package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */

public class allDigitsRE {
    public static void main(String[] args) {
        int n = 2725;

        allDigit(n);
    }

    static void allDigit(int n) {
        if (n == 0) {
            return;
        }
        int a = n%10;
        allDigit(n/10);
        System.out.println(a);
    }
}