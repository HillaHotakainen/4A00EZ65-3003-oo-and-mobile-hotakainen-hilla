import java.io.Console;

class E1 {
    public static void main(String[] args) {
        Console c = System.console();

        double result = 0;

        System.out.print("give number 1: ");
        double one = Integer.parseInt(c.readLine());

        System.out.print("give operator: ");
        String mark = c.readLine();

        System.out.print("give number 2: ");
        double two = Integer.parseInt(c.readLine());

        if(mark.equals("+")){
            double plus = one + two;
            result = result + plus;
            System.out.print("Result: ");
            System.out.print(result);
        } else if (mark.equals("-")){
            double minus = one - two;
            result = result + minus;
            System.out.print("Result: ");
            System.out.print(result);
        } else if (mark.equals("*")){
            double add = one * two;
            result = result + add;
            System.out.print("Result: ");
            System.out.print(result);
        } else if (mark.equals("/")){
            double div = one / two;
            result = result + div;
            System.out.print("Result: ");
            System.out.print(result);
        } else {
            System.out.println("that was not an operator my dude");
        }
    }
}