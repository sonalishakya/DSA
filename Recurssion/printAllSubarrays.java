package PrepDSA.Recurssion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class printAllSubarrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        print(a, 0, a.length-1);
    }

    static void print(int[] a, int start, int end) {

        if (start == end)
            return;

        for (int i = start ; i <= end ; i++) {
            for (int j = start; j <= i ; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }


        print(a, start+1, end);

    }
}

