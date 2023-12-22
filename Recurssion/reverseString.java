package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class reverseString {
    public static void main(String[] args) {
        String s = "Sahej";
        String ans = "";
        System.out.println(solve(s.toCharArray(), s.length(), 0, ans));
    }

    static String solve(char[] ch, int n, int i, String s) {
        if (i == n-1) {
            return String.valueOf(ch[i]);
        }

        return solve(ch, n, i+1, s) + ch[i];
    }
}
