class Box {
    double w,h,d,vol;

    Box (double w, double d, double h) {
        
        this.h = h;
        this.d = d;
        this.w = w;
    }
    void display () {
        vol = w * h * d;
        System.out.println("Volume = " + vol);
    }
}


public class This {
    public static void main (String[] args) {

        Box b = new Box (3,3,3);
        b.display();

    }
     
    
}
