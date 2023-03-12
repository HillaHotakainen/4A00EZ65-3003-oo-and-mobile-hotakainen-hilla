
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

    //better to make new one here so the old one does not change
    public void setStartingPoint(Point start){
        this.startingPoint = new Point(start.getX(), start.getY());
    }

    //better to make new one here so the old one does not change
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

    public boolean equals (Line line) {
        return getStartingPoint().equals(line.getStartingPoint()) && getEndingPoint().equals(line.getEndingPoint());
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

    public boolean equals(Point mark){
        return this.x == (mark.getX()) && this.y == (mark.getY());
    }
}

class Main {
    public static void main(String [] args){
        Line line1 = new Line(5,5,10,10);
        Point a = new Point(0,0);
        line1.setStartingPoint(a);
        a.setX(1);
        System.out.println(line1);
    }
}