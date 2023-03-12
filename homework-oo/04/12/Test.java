import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Point myPointObject = new Point();
        //Prints out:
        //Point created (default constructor)
        //x is 0and y is 0
        //Because when Point is created its constructor is also being called
        //it is not possible to call Point withous using its toString,
        //because the toString has been overridden.
        System.out.println(myPointObject);
    }
}
