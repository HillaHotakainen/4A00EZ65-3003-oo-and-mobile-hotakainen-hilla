import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Pixel pi = new Pixel(4,4,"red");
        //Call base classes parameter constructor for initializing the x and y (why?):
        //I mean Point is called because Pixel extends it idk what you want here??
    }
}