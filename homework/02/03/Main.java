class Main {
    public static void main(String [] args){
        Point p = new Point();
        p.setX(2);
        p.setY(3);
        p.setZ(4);
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.getZ()); // I choose private with access via setter/getter, because that way the code in side of 
        //                              both set and get methos can be modified without touching main method
    } 
}
