package PrepDSA.NewRandom;

public class palindrome {
    public static void main(String[] args) {
        String s = "Soinaenos";
//        System.out.println(rev(s.toLowerCase()));

        if (s.length() % 2 == 0) {
            if (s.substring(0, s.length()/2).equalsIgnoreCase(rev(s.substring(s.length()/2, s.length())))) {
                System.out.println("Even palindrome");
            } else {
                System.out.println("Not even palindrome");
            }
        } else {
            if (s.substring(0, s.length()/2).equalsIgnoreCase(rev(s.substring((s.length()/2 + 1), s.length())))) {
                System.out.println("Odd Palindrome");
            } else {
                System.out.println("Not odd palidrome");
            }
        }


    }

    static String rev(String s) {
        if (s.isEmpty()) {
            return "";
        }

        return s.charAt(s.length()-1) + rev(s.substring(0, s.length()-1));
    }

//    static String oddCheck() {
//
//    }


}
