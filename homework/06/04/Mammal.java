
abstract class Mammal {
    public void giveBirth() {
        System.out.println("Giving birth");
    }
    abstract void makeSound();
}

class Dog extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("Wow");
    }
}