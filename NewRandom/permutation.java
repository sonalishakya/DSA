package PrepDSA.NewRandom;

public class permutation {
    public static void main(String[] args) {
        String s = "abc";
//        permute("", s);
        System.out.println(sumPermute("", s));
    }

    static void permute(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permute(f+ch+s, up.substring(1));
        }
    }

    static int sumPermute(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <=  p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + sumPermute(f + ch + s, up.substring(1));
        }
        return count;
    }
}
