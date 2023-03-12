package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    //you can use the super to use the Point class print method.
    public void print() {
        super.print();
        System.out.println(color);
}
}
