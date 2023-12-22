package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class powerRE {
    public static void main(String[] args) {
        int a = 2, b = 5;

        System.out.println(power(a, b));
    }

    static int power(int a, int b) {
        if (b == 0)
            return 1;

        return a * power(a, b-1);
    }
}
