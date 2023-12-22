package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class addStrings {
    public static void main(String[] args) {
        String a = "456";
        String b = "77";
        String ans = "";
        ans = sum(a.toCharArray(), a.length()-1, b.toCharArray(), b.length()-1, 0, ans, 0);
        System.out.println(reverse(ans));
    }

    static String sum(char[] a, int an, char[] b, int bn, int i, String ans, int reminder) {
        int sum;
        String k = "";
        if (i > bn && i > an) {
            if (reminder == 0)
                return ans;
            else
                return (ans + reminder);
        } else if (i > bn) {
            sum =  (a[an - i] - '0') + reminder;
        } else if (i > an) {
            sum =  (b[bn - i] - '0') + reminder;
        } else {
            sum = (a[an - i] - '0') + (b[bn - i] - '0') + reminder;
        }
        int digit = sum%10;
        reminder = sum/10;
        ans = ans + digit;

        k += sum(a, an , b, bn, i+1, ans, reminder);

        return k;
    }

    static String reverse(String s) {
        int i = s.length()-1;
        String ans = "";
        char ch;
        while (i >= 0) {
            ch = s.charAt(i);
            ans += ch;
            i--;
        }

        return ans;
    }
}
