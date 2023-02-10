
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


class App {
    public static void main(String [] args) {
        Human human = new Human("Hooman");
        Dog dog = new Dog("Doggo");
        Bird bird = new Bird("Birdy");

        //can take any object that extends to animal
        method1(human);
        method1(dog);
        method1(bird);

        //can take any object that extends to mammal
        method2(human);
        method2(dog);

        //can only take human objects
        method3(human);

        //can take any object
        method4(human);
        method4(dog);
        method4(bird);

    }
    public static void method1(Animal a) {

    }
    public static void method2(Mammal a) {
        //this can be called since it belongs to Mammal and all of it extended classes
        a.giveBirthToLivingChild();
        //these can not be called since they don't belong to the Mammal class
        //a.sniffButt();
        //a.createArt()

    }
    public static void method3(Human a) {

    }
    public static void method4(Object a) {

    }
}