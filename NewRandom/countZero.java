package PrepDSA.NewRandom;

public class countZero {
    public static void main(String[] args) {
        int num = 30204000;
        System.out.println(count(num, 0));
    }

    static int count(int n, int c) {
        if (n == 0) {
            return c;
        }
        int a = n%10;
        System.out.println(a);
        if (a == 0)
            c += 1;
        System.out.println("count : " + c);
        return count(n/10, c);
    }
}
