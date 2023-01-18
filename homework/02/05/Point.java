public class Point {
    private int x;
    private int y;
    private int z;
    
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public String toString() {
        return "x = " + x + ", y = " + y + ", z = " + z;
    }
    public boolean equals(Point helper){
        if (this.x == helper.x && this.y == helper.y && this.z == helper.z) {
            return true;
        } else {
            return false;
        }
    }
}
