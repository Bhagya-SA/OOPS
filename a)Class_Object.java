class Box {
    double width;
    double height;
    double depth;
}
public class Class_Object {
    public static void main (String[] args) {

        Box obj = new Box ();

        double vol;

        obj.width = 10;
        obj.height = 10;
        obj.depth = 10;

        vol = obj.width * obj.height * obj.depth;
        System.out.println("Volume =" + vol);

    }
}
