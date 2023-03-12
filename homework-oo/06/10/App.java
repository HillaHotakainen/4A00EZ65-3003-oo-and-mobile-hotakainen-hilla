
interface Flyable {
    public void fly(int speed);
}

class Bird implements Flyable {
    public void fly(int speed){
        if (speed < 0){
            System.out.println("Flying backwards");
        } else {
            System.out.println("Flying forwards");
        }
    }
}

class Airplane implements Flyable {
    public void fly (int speed) {
        System.out.println("Flying at speed: " + speed);
    }
}

class App {
    public static void main(String [] args) {
        Bird bird = new Bird();
        flyMe(bird);

        Airplane airplane = new Airplane();
        flyMe(airplane);
        
        flyMe(new Flyable() {
            public void fly(int speed) {
                System.out.println("Flying at speed: " + speed);
            }
        });

        flyMe((speed) -> System.out.println(speed));

        flyMe(System.out::println);
    }

    public static void flyMe(Flyable f) {
        f.fly(20);
    }
}
