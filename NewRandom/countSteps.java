package PrepDSA.NewRandom;

public class countSteps {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(steps(n, 0));
    }

    // n - constant no. of stairs
    // s - current step
    // c - count of possibilities
    static int steps(int n, int s) {
        if (s == n) {
            return 1;
        }
        if (s == n-1) {
            return steps(n, s+1);
        }
        return steps(n, s+1) + steps(n, s+2);
    }
}
