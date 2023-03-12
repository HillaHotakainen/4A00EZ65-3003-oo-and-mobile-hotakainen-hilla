import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        //x and y attribute have protected access, the Test class can not access them.
        //Only point and stuff that inherits it can access it.
        Pixel ab = new Pixel();
        ab.x = 4;
        ab.y = 10;
        ab.color = "punainen";
        ab.print();

        //Situation does not change, because you still can't access the x or y via Test class
        //only point and stuff that inherits it can access it.
        Point a = new Point();
        a.x = 4;
        a.y = 10;
    }
}