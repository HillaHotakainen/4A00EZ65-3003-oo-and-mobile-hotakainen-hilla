public class Point {
    private int x;
    private int y;
    private int z;
    
    public void setX(int x){
        if(x > 0){
            this.x = x;
        } else {
            throw new IllegalArgumentException("No negative values allowed");
        }
    }
    public void setY(int y){
        if(y > 0){
            this.y = y;
        } else {
            throw new IllegalArgumentException("No negative values allowed");
        }
    }
    public void setZ(int z){
        if(z > 0){
            this.z = z;
        } else {
            throw new IllegalArgumentException("No negative values allowed");
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
}
