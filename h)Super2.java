class A {
    void show () {
        System.out.println("show() in class A");
    }
}
class B extends A {
    void show () {
        super.show(); //Prints both statements of super and sub class
        System.out.println("show() in class B");
    }
}


public class Super2 {
    public static void main (String[] args) {
        B obj = new B();
        obj.show();

    }
    
}
