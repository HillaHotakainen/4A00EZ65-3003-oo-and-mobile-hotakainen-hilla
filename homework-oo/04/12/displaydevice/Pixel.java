package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public Pixel(){
        System.out.println("Pixel created (default constructor)");
    }

    public Pixel(int x, int y, String color){
        System.out.println("Point created (parameter constructor)");
    }

    public void printTypo() {
        super.print();
        System.out.println(color);
    }
}
