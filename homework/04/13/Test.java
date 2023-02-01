import coordinate.Point;
import displaydevice.Pixel;


class Test {
    public static void main(String [] args) {
        Point point = new Point();
        //any Point type of object
        method1(point);
        Pixel pixel = new Pixel();
        //any Pixel type of object
        method2(pixel);
        Object object = new Object();
        //any Object
        method3(object);
    }
    public static void method1(Point point) {
        // any methods in Point class, like:
        System.out.println(point.getX());
    }
    public static void method2(Pixel pixel) {
        // any methods in Pixel class and in Point class, like;
        System.out.println(pixel.getColor());
        System.out.println(pixel.getX());
    }
    public static void method3(Object object) {
        // any methods in Object class. There is shit ton of them. for example:
        System.out.println(object.toString());
    }
}
