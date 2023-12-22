package PrepDSA.SDEContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class intToString {
    public static void main(String[] args) {
        int n = 678954;

        List<String> ones = new ArrayList<>();
        Collections.addAll(ones, "One,Two,Three,Four,Five,Six,Seven,Eight,Nine".split(","));

        List<String> tens = new ArrayList<>();
        Collections.addAll(tens, "Ten,Twenty,Thirty,Forty,Fifty,Sixty,Seventy,Eighty,Ninety".split(","));

        List<String> teens = new ArrayList<>();
        Collections.addAll(teens, "Eleven,Twelve,Thirteen,Fourteen,Fifteen,Sixteen,Seventeen,Eighteen,Nineteen".split(","));

        List<String> units = new ArrayList<>();
        Collections.addAll(units, "","Thousand","Million","Billion");

        String s = "";
        s = unit_count(n, ones, teens, tens, units, s);
        System.out.println(s.trim());
    }

    static String unit_count(int n, List<String> ones, List<String> teens, List<String> tens, List<String> units, String s) {
        int c = 0, hun = 0, len = 0;
        if (n == 0)
            return "Zero";
        while (n>0) {
            hun = n%1000;
            len = count(hun);
            if (len >= 3)
                s = hun_count(hun, ones) + ten_count(hun % 100, ones, teens, tens) + units.get(c) + " " + s;
            if (len == 2)
                s = ten_count(hun%100, ones, teens, tens) + units.get(c) + " " + s;
            if (len == 1)
                s = ones.get((int) hun - 1) + " " + units.get(c) + " " + s;
            n = n/1000;
            c++;
        }
        return s;
    }

    static String hun_count(int hun, List<String> ones) {
        String s = "";
        int hun_digit = hun / 100;
        if (hun_digit == 0)
            s = s + "";
        else
            s = s + ones.get(hun_digit - 1) + " Hundred ";
        return s;
    }

    static String ten_count(int ten, List<String> ones, List<String> teens, List<String> tens) {
        String s = "";
        if (ten == 0)
            s = s + "";
        else if (ten > 0 && ten < 10)
            s = s + ones.get(ten-1) + " ";
        else if (ten%10 == 0)
            s = s + tens.get((ten/10) - 1) + " ";
        else if (ten >= 11 && ten <= 19){
            s = s + teens.get(ten - 11) + " ";
        } else {
            s = s + tens.get((ten/10) - 1) + " " + ones.get((ten%10) - 1) + " ";
        }
        return s;
    }

    static int count(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

//    static String word(long n, List<String> ones, List<String> teens, List<String> tens, List<String> units, int count) {
//        String s = "";
//        int c = 0;
//        int num = Integer.parseInt(String.valueOf(n));
//        switch (count) {
//            case 1:   //n%count
//                s = s + ones.get(num - 1);
//            case 2:
//                if (num == 10)
//                    s = s + "ten ";
//                else if (num == 20)
//                    s = s + "twenty ";
//                else if (num >= 11 && num <= 19){
//                    s = s + teens.get(num - 1) + " ";
//                } else {
//                    s = s + tens.get(num/10 - 1) + " " + ones.get(num%10 - 1) + " ";
//                }
//            default:
//                while (n>0) {
//                    if (c > 0)
//                        s = units.get(c) + " " + s;
//                    long p = n % 1000;
//                    long hun = p / 100;
//                    if (hun == 0)
//                        s = s + "";
//                    else
//                        s = s + ones.get((int) (hun - 1)) + " " + units.get(0) + " ";
//                    int ten = (int) p % 100;
//                    if (ten == 0)
//                        s = s + "";
//                    else if (ten%10 == 0)
//                        s = s + tens.get((ten/10) - 1);
//                    else if (ten >= 11 && ten <= 19){
//                        s = s + teens.get( (ten - 11)) + " ";
//                    } else {
//                        s = s + tens.get((ten/10) - 1) + " " + ones.get((ten%10) - 1) + " ";
//                    }
//                    n = n/1000;
//                    c++;
//                }
//        }
//        return s;
//    }
}
