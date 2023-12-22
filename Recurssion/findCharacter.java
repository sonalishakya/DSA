package PrepDSA.Recurssion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class findCharacter {
    public static void main(String[] args) {
        String s = "SonaliShakya";
        char c = 'S';
        List<Integer> ans = new ArrayList<>();
        System.out.println(findCharRE(s.toCharArray(), s.length(), c, 0, ans));
    }

    static List<Integer> findCharRE(char[] ch, int n, char c, int i, List<Integer> ans) {
        if (i >= n)
            return ans;
        if (ch[i] == c) {
            ans.add(i);
        }
        return findCharRE(ch, n, c, i+1, ans);
    }
}
