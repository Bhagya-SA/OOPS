class A {
    final void show () { //To prevent MethodOverriding
        System.out.println("show() in class A");
    }
}
class B extends A {
    void show () {
        System.out.println("show() in class B");
    }
}




public class Final2 {

    public static void main (String[] args) {
        B obj = new B();
        obj.show();

    }
    
}
 
