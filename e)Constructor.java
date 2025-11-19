class Box {
    double w, h, d,vol;

    Box() {
        w = h = d = 3;
    }
    void display() {
        vol = w * h * d;
        System.out.println("Volume = " + vol);
    }
}

public class Constructor {
    public static void main (String[] args) {

        Box b = new Box ();
        b.display();

    }
    
}
