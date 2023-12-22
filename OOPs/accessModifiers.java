package PrepDSA.OOPs;

/**
 * @author: sonali.shakya
 */
public class accessModifiers {
    public static void main(String[] args) {
        testModifiers testModifiers = new testModifiers();
        System.out.println(testModifiers.a);
        System.out.println(testModifiers.b);
    }
}

class testModifiers {
    int a;
    int b;
}


