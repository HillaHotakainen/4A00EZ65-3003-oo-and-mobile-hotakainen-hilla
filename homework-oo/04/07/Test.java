import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        Pixel pixel = new Pixel();
        //output is:
        //Point created (default constructor)
        //Point created (default constructor)
        //Pixel created (default constructor)
        //Because when pixel is created it also creates Point, since Pixel is extended from Point
    }
}