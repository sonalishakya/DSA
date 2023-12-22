package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class palindrome {
    public static void main(String[] args) {
        String rev = "racetar";
        System.out.println(palindromeCheck(rev, 0, rev.length()-1));
    }
    static boolean palindromeCheck(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return palindromeCheck(str, start + 1, end -1);
    }
}
