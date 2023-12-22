package PrepDSA.Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
public class phoneCombinations {

    public static void main(String[] args) {
        String s = "23";
        Map<Integer, String> phone = new HashMap<>();
        phone.put(2, "abc");
        phone.put(3, "def");
        phone.put(4, "ghi");
        phone.put(5, "jkl");
        phone.put(6, "mno");
        phone.put(7, "pqrs");
        phone.put(8, "tuv");
        phone.put(9, "wxyz");


        List<String> solution = new ArrayList<>();
        if (s.length() == 0)
            return;
        solve(s, phone, "", 0, solution);

        for (String p : solution)
            System.out.println(p);
    }

    static void solve(String ch, Map<Integer, String> phone, String str, int i, List<String> sol) {
        if (i == ch.length()) {
            sol.add(str);
            return;
        }
        String currentValue = phone.get(ch.charAt(i) - '0');
        for (int k = 0; k < currentValue.length(); k++) {
            solve(ch, phone, str + currentValue.charAt(k), i+1, sol);
        }
    }
}
