package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public void print(){
        //can't print out x or y because they are private, therefore not accessible without getter.
        System.out.println("x=" + x + " y=" + y + " color=" + color);
    }
}