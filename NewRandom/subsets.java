package PrepDSA.NewRandom;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        String s = "abc";
//        subs("", s);
//        removeA("", "acedjabcjaakk");
//        removeApple("", "ddvapplencjappl");
//        removeAppleNotApp("", "ddvapplencjappl");
        System.out.println(subsList("", "abc"));
    }

    static void removeA(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'A' || ch == 'a') {
            removeA(p, up.substring(1));
        } else {
            removeA(p+ch, up.substring(1));
        }
    }

    static void removeApple(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith("apple"))
            removeApple(p, up.substring(5));
        else
            removeApple(p+up.charAt(0), up.substring(1));
    }

    static void removeAppleNotApp(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith("app") && !up.startsWith("apple"))
            removeApple(p, up.substring(3));
        else
            removeApple(p+up.charAt(0), up.substring(1));
    }

    static void subs(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        subs(p, up.substring(1));
        subs(up.charAt(0) + p, up.substring(1));
    }

    static ArrayList<String> subsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> right = subsList(p, up.substring(1));
        ArrayList<String> left = subsList(p + up.charAt(0), up.substring(1));

        left.addAll(right);
        return left;
    }
}
