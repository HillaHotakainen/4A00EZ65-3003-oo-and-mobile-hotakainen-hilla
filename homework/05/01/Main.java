abstract class Mammal {
    private String name;

    public Mammal (String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void giveBirthToLivingChild(){
        System.out.println("giving birth to living child");
    }
}

class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }
}

public class Main {
    public static void main(String[] args) {
        //can't create object from abstract
        //Mammal mammala = new Mammal();
        Dog spot = new Dog("Spot");
        System.out.println( spot.getName() );
        spot.giveBirthToLivingChild();
    }
}