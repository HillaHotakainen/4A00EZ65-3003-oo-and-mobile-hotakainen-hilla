
interface Flyable {
    public void fly();
}

class App {
    public static void main(String [] args) {
        flyMe(() -> System.out.println("Flying"));
    }
    public static void flyMe(Flyable a) {
        a.fly();
    }
}
