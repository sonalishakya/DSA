package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class countRE {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(count(n));
    }

    static int count(int n) {
        if (n == 1)
            return 1;
        System.out.println(n);
        return count(n-1);
    }
}
