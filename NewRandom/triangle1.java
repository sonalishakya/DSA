package PrepDSA.NewRandom;

public class triangle1 {
    public static void main(String[] args) {
        int n = 5;
        draw(n);
    }

    static void draw(int n) {
        if (n == 0)
            return;

        draw(n-1);

        int i = n;
        while( i != 0) {
            System.out.print("* ");
            i--;
        }
        System.out.println();
//        draw(n-1);
    }
}
