class A {
    void show() {
        System.out.println("show() in class A");
    }
}
class B extends A {
    void show() {
        System.out.println("show() in class B");
    }
}


public class MethodOverriding {

    public static void main (String[] args) {

        B ob = new B();
        ob.show();

    }
    
}
