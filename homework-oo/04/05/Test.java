import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Pixel ab = new Pixel();
        ab.x = 4;
        ab.y = 10;
        ab.color = "punainen";
        ab.print();

        Point a = new Point();
        a.x = 4;
        a.y = 10;
    }
}