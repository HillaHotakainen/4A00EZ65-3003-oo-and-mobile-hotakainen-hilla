class Main {
    public static void main(String [] args){
        Point p1 = new Point(1,2,3);
        Point p2 = new Point(1,2);
        Point p3 = new Point(1,2,3);
        
    System.out.println(p1.equals(p2)); //gives false, equals only returns true if both sides refer to same object.
    System.out.println(p1.toString()); //prints the memory spot, toString normally returns a string that "textually represents" the object.
    System.out.println(p1); //prints the memory spot
    System.out.println(p1.equals(p3));
    } 
}
