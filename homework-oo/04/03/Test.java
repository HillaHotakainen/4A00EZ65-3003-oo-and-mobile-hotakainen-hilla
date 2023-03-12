import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 1;
        point.y = 2;

        Pixel pixel = new Pixel();
        pixel.x = 10;
        pixel.y = 20;
        pixel.color = "pink";

        System.out.println("Point has: x=" + point.x + " y=" + point.y);
        System.out.println("Pixel has: x=" + pixel.x + " y=" + pixel.y + " color=" + pixel.color);
        pixel.print();
        //errors with compiling happen because the attributes are private, so they can not be accessed directly.

        Pixel a = new Pixel();
        // a.x = 4;
        // a.y = 10;
        // a.color = "punainen";
        a.print(); 
        
    }
}