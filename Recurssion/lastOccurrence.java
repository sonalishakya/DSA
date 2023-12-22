package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class lastOccurrence {
    public static void main(String[] args) {
        String s = "Wasabi";
        char ch = 'a';

        solve(s.toCharArray(), ch, s.length()-1);

    }

    static void solve(char[] a, char target, int i) {
        if (i < 0) {
            System.out.println("Not found");
            return;
        }

        if (a[i] == target) {
            System.out.println("Found " + a[i] + " at " + i);
            return;
        }

        solve(a, target, i-1);
    }
}
