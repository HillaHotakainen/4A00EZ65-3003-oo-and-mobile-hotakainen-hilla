import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Pixel p = new Pixel();
        //Can not access x or y because they are private in Point, 
        //so they are not accessible by Pixel.
        p.print();
    }
}