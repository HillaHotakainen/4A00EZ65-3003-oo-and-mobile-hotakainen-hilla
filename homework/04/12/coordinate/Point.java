package coordinate;

public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("Point created (default constructor)");
    }

    public Point(int x, int y){
        System.out.println("Point created (parameter constructor)");
    }

    public void print() {
        System.out.println(x);
        System.out.println(y);
    }

    //@Override works because every class has as a default a toString method because every class
    //extendes (by default) from Object which has a toString method.
    @Override
    public String toString(){
        return "x is " + x + "and y is " + y;
    }
}