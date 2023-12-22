package PrepDSA.SDEContest;

import java.util.ArrayList;

/**
 * @author: sonali.shakya
 */

public class PatternPrinting {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(printPattern(N));
    }

    static ArrayList<Character> printPattern(int N) {
        ArrayList<Character> arc = new ArrayList<>();
        for (int i  = 0; i < N; i++) {
            for (int j = 0 ; j <=i; j++) {
                arc.add('*');
            }
            arc.add(' ');
        }

        return arc;
    }
}
