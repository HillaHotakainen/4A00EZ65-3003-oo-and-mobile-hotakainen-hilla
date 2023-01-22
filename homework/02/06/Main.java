import java.awt.Color;

class Main {
    public static void main(String [] args){
        Color color = new Color(255, 0, 0, 127);//if value is over 255 program turns but crashes because max value is 255
        System.out.println(color); //prints out the rgb values of color
        System.out.println(color.toString()); //also prints rgb values??
        System.out.println(color.darker()); //lowers the values of color making it darker
        System.out.println(color.brighter()); //raises the values of color making it brighter, but does not go over 255
        System.out.println(color.darker().equals(color.darker())); //compares of both given colors are same
    } 
}