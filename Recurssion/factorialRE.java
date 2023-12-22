package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class factorialRE {
    public static void main(String[] args) {
        int n = 5;

        //O(n)
        System.out.println(recursiveFact(n));
    }


    static int recursiveFact(int n) {
        if (n == 1)
            return 1;
        return n * recursiveFact(n-1);
    }
}
