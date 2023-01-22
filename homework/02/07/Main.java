import java.awt.Color;
import java.io.Console;
import java.util.ArrayList;

class Main {
    public static void main(String [] args){
        Console c = System.console();

        System.out.print("Give color values (answer exit if you want to quit)");
        String value = c.readLine();
        ArrayList<Object> stringList = new ArrayList<>();

        while(!value.equals("exit")){
            ArrayList<Integer> intList = new ArrayList<>();
            String[] splited = value.split(",");

            for(String sos : splited){
                intList.add(Integer.parseInt(sos));
            }
            if(intList.get(0) < 0 || intList.get(0) > 255 || intList.get(1) < 0 || intList.get(1) > 255 || intList.get(2) < 0 || intList.get(2) > 255){
                System.out.println("Please give value between 1-255");
                value = c.readLine();
            } else {
                int r = intList.get(0);
                int g = intList.get(1);
                int b = intList.get(2);
                Color color = new Color(r,g,b);
                stringList.add(color);
                value = c.readLine();
            }
            

            
        }
        System.out.println("You gave colors:");
        for(int i=0; i < stringList.size(); i++){
                System.out.println(stringList.get(i));
            }
    } 
}