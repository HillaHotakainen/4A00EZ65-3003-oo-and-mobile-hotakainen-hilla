import java.io.Console;
import java.util.Scanner;

class E2 {
    public static void main(String[] args) {
        Console c = System.console();
        Scanner input = new Scanner(System.in);

        System.out.print("give a string: ");
        String str = c.readLine();
        int length = str.length();
        System.out.print("give character: ");
        char wanted = input.next().charAt(0);

            for(int i = 0; i < length; i++) {
            char found = str.charAt(i);
            if(Character.compare(found, wanted) == 0){
                System.out.println("The first '" + wanted + "' was found in index " + i);
                break;
            } else if (i == length - 1) {
                System.out.println("No '" + wanted + "' found from given string.");
            }
        }
    }
}