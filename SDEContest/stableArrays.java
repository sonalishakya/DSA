package PrepDSA.SDEContest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sonali.shakya
 */
//WRONG
public class stableArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 1, 4, 3};

        Map<Integer, Integer> hash = hashFrequency(a);

        for (Map.Entry x : hash.entrySet()) {
            System.out.println(x);
        }

        //hash map of the frequency of occurrence
        //frequency existing more
    }

    static Map<Integer, Integer> hashFrequency(int[] N) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count;
        for (int i = 0; i < N.length; i++) {
            if (!freq.containsKey(N[i])) {
                freq.putIfAbsent(N[i], 1);
            } else {
                count = freq.get(N[i]);
                count++;
                freq.put(N[i], count);
            }
        }
//        checkFrequency(freq);
        return freq;
    }

//    static int checkFrequency(Map<Integer, Integer> freq) {
//        freq.values().stream().max()
//    }
}
