
class Line {
    private Point startingPoint;
    private Point endingPoint;

    public Line(int startX, int startY, int endX, int endY) {
        setStartingPoint(startX, startY);
        setEndingPoint(endX, endY);
    }

    public void setStartingPoint(int x, int y){
        startingPoint = new Point(x, y);
    }

    public void setEndingPoint(int x, int y){
        endingPoint = new Point(x, y);
    }

    public void setStartingPoint(Point start){
        this.startingPoint = new Point(start.getX(), start.getY());
    }

    public void setEndingPoint(Point end){
        this.endingPoint = new Point(end.getX(), end.getY());
    }

    Point getStartingPoint(){
        return this.startingPoint;
    }

    Point getEndingPoint(){
        return this.endingPoint;
    }

    public String toString(){
        return startingPoint + "," + endingPoint;
    }
}

class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        setX(x);
        setY(y);
    }
    
    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int getX () {
        return this.x;
    }

    public int getY () {
        return this.y;
    }

    public String toString(){
        return "[x = " + this.x + ", y = " + this.y + "]";
    }
}

class Main {
    public static void main(String [] args){
        Line line = new Line(5,5,10,10);
        System.out.println(line); // [x = 5, y = 5], [x = 10, y = 10]
    } 
}