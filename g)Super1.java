class A{
    A() {
        System.out.println("A's Constructor");
    }
}
class B extends A {
    B() {
        super(); //output remains same with or without super keyword
        System.out.println("B's Constructor");
    }
}


public class Super1 {

    public static void main (String[] args) {

        B obj = new B();
        


    }
    
}
 
