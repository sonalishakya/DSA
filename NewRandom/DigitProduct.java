package PrepDSA.NewRandom;

public class DigitProduct {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(multiple(num));
    }

    static int multiple(int n) {
        if (n == 0)
            return 1;

        return n%10 * multiple(n/10);
    }
}
