class Sample {
    void test () {
        System.out.println("No Parameter");
    }
    void test (int a) {
        System.out.println("a = " + a);
    }
    void test (int a, int b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    void test (double a) {
        System.out.println("a = " + a);
    }
}


public class MethodOverloading {
    public static void main (String[] args) {

        Sample s = new Sample ();
        s.test ();
        s.test(10);
        s.test(20,30);
        s.test(10.0);

    }
    
}
