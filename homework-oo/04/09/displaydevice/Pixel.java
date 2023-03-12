package displaydevice;
import coordinate.Point;

public class Pixel extends Point {
    private String color;

    public Pixel(){
        System.out.println("Pixel created (default constructor)");
    }

    public Pixel(int x, int y, String color){
        System.out.println("Pixel created (parameter constructor)");
    }

    public void print() {
        super.print();
        System.out.println(color);
    }

}
