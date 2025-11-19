class Box {
    double width, height, depth, vol;

    void display() {
        vol = width * height * depth;
        System.out.println("Volume = " + vol);

    }
}


public class Methods {
    public static void main (String[] args) {

        Box b = new Box();
        
        b.width = 10;
        b.depth = 30;
        b.height = 20;

        b.display();

    }
    
}
