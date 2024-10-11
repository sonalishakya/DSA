package PrepDSA.NewRandom;

public class reverseNum {
    public static void main(String[] args) {
        int num = 123;
        int n = num;
        int c = 0;
        while(num != 0) {
            num /= 10;
            c++;
        }
        System.out.println(c);
        System.out.println(rev(n, c-1));
    }

    static int rev(int n, int c) {
        if (n == 0) {
            return 0;
        }

        System.out.println((n%10) * Math.pow(10, c));
        return (int) (((n%10) * Math.pow(10, c)) + rev(n/10, c-1));
    }
}
