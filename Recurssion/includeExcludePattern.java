package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class includeExcludePattern {
    public static void main(String[] args) {
        String s = "abc";
        possibleSubstrings(s.toCharArray(), "", s.length(), 0);
    }

    static void possibleSubstrings(char[] ch, String output, int n, int i) {
        //base case
        if (i >= n){
            System.out.println(output);
            return;
        }
        //exclude
        possibleSubstrings(ch, output, n, i+1);
        //include
        possibleSubstrings(ch, output + ch[i], n, i+1);

    }
}
