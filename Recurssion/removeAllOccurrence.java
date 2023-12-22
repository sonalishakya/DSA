package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class removeAllOccurrence {
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(remove(s, part));

    }
    static String remove(String s, String part) {
        if (s.contains(part)) {
            s = s.replaceAll("abc", "");
        }
        if (s.contains(part))
            return remove(s, part);
        else
            return s;
    }
}
