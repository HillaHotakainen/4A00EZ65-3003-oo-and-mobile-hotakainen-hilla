package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public void print(){
        System.out.println("x=" + x + " y=" + y + " color=" + color);
    }
}