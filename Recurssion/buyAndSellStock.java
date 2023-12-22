package PrepDSA.Recurssion;

/**
 * @author: sonali.shakya
 */
public class buyAndSellStock {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        maxDiffRec(a, a[0],0,0);
    }

    static int maxiDif(int[] a) {
        int dif = 0, max = 0, min = a[0];

        for (int i = 0 ; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] - min > max)
                max = a[i] - min;
        }
        return max;
    }

    static void maxDiffRec(int[] a, int min, int max, int i) {
        if (i == a.length) {
            System.out.println(max);
            return;
        }
        if (a[i] < min)
            min = a[i];
        if (a[i] - min > max)
            max = a[i] - min;

        maxDiffRec(a, min, max, i+1);
    }
}
