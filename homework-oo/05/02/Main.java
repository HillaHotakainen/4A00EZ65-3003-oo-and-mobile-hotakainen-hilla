
abstract class Animal {
    private String name;

    public Animal (String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Bird extends Animal {
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println("birb is flying");
    }
}

abstract class Mammal extends Animal {

    public Mammal(String name){
        super(name);
    }

    abstract void makeSound();

    public void giveBirthToLivingChild(){
        System.out.println("giving birth to living child");
    }
}

class Dog extends Mammal {
    public Dog(String name){
        super(name);
    }

    public void sniffButt(){
        System.out.println("sniffing other dogs butts");
    }

    @Override
    public void makeSound(){
        System.out.println("Woof woof");
    }
}

class Human extends Mammal {
    public Human(String name){
        super(name);
    }

    public void createArt(){
        System.out.println("creating art");
    }

    @Override
    public void makeSound(){
        System.out.println("unga bunag");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot");
        System.out.println( spot.getName() );
        spot.makeSound();
        Human josh = new Human("Josh");
        System.out.println(josh.getName());
        josh.makeSound();
        Bird bird = new Bird("birdy");
        bird.fly();
    }
}