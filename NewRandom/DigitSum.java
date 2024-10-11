package PrepDSA.NewRandom;

public class DigitSum {
    public static void main(String[] args) {
        int num = 333;
        System.out.println(sum(num));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + sum(n/10);
    }
}
