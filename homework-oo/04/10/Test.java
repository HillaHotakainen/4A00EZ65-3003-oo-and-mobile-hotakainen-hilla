import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
        Pixel p = new Pixel();
        //Fails because Point is missing a constructor, Pixel extends it and needs to use
        //Points constructor because when pixel is created it needs Point idk how to explain.
    }
}