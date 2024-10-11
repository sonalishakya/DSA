package PrepDSA.NewRandom.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneCombo {

    private static final Map<Character, String> KEYPAD = new HashMap<>();

    static {
        KEYPAD.put('2', "abc");
        KEYPAD.put('3', "def");
        KEYPAD.put('4', "ghi");
        KEYPAD.put('5', "jkl");
        KEYPAD.put('6', "mno");
        KEYPAD.put('7', "pqrs");
        KEYPAD.put('8', "tuv");
        KEYPAD.put('9', "wxyz");
    }

    public static List<String> getResult(String n) {
        List<String> result = new ArrayList<>();
        if (n.isEmpty())
            return result;

        loop(n, "", 0, result);
        return result;
    }

    public static void loop(String digit, String combo, int index, List<String> result) {
        if (index == digit.length()) {
            result.add(combo);
            return;
        }

        char ch = digit.charAt(index);
        String key = KEYPAD.get(ch);
        for (char c : key.toCharArray()) {
            loop(digit, combo + c, index+1, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(getResult("23"));
    }


//    private static final Map<Character, String> KEYPAD = new HashMap<>();
//
//    static {
//        KEYPAD.put('2', "abc");
//        KEYPAD.put('3', "def");
//        KEYPAD.put('4', "ghi");
//        KEYPAD.put('5', "jkl");
//        KEYPAD.put('6', "mno");
//        KEYPAD.put('7', "pqrs");
//        KEYPAD.put('8', "tuv");
//        KEYPAD.put('9', "wxyz");
//    }
//
//    public static List<String> letterCombinations(String digits) {
//        List<String> result = new ArrayList<>();
//        if (digits == null || digits.isEmpty()) {
//            return result;
//        }
//        backtrack("", digits, 0, result);
//        return result;
//    }
//
//    private static void backtrack(String combination, String digits, int index, List<String> result) {
//        if (index == digits.length()) {
//            result.add(combination);
//            return;
//        }
//
//        char digit = digits.charAt(index);
//        System.out.println("digit -- " + digit);
//        String letters = KEYPAD.get(digit);
//        System.out.println("letters -- " + letters);
//        for (char letter : letters.toCharArray()) {
//            backtrack(combination + letter, digits, index + 1, result);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(letterCombinations("234")); // ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
//    }

//    public static void main(String[] args) {
//        Map<Integer, String> phone = new HashMap<>();
//        phone.put(1, "");
//        phone.put(2, "abc");
//        phone.put(3, "def");
//        phone.put(4, "ghi");
//        phone.put(5, "jkl");
//        phone.put(6, "mno");
//        phone.put(7, "pqrs");
//        phone.put(8, "tuv");
//        phone.put(9, "wxyz");
//    }
//
//    static List<String> combo(int num, Map<Integer, String> phone) {
//        List<String> results = new ArrayList<>();
//        String up, p = "";
//        while (num > 0) {
//            int digit = num%10;
//            up = phone.get(digit);
//            results.addAll(loop(p, up));
//            num = num/10;
//        }
//        return results;
//    }
//
//    static void loop(String p, String up) {
//        List<String> result = new ArrayList<>();
//        if (up.isEmpty()) {
////            System.out.println(p);
//            return result;
//        }
//        char ch = up.charAt(0);
//        result.addAll(loop(p+ch, up.substring(1)));
//
//
//    }
}


















