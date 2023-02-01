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

    //Does not compile because the Point (parent class) does not have 
    //a method called printTypo. @Override only works if the parent class
    //has a same name method in it.
    @Override
    public void printTypo() {
        super.print();
        System.out.println(color);
    }

}
