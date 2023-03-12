
interface SellableItem {
    void sell();
}

class Store {
    private String name;

    public Store(String name){
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

class SoftDrink implements SellableItem {
    @Override
    public void sell() {
        System.out.println("Softdrink has been sold");
    }
}

class Dog implements SellableItem {
    @Override
    public void sell() {
        System.out.println("Dog has been sold");
    }
}

class Bird implements SellableItem {
    @Override
    public void sell() {
        System.out.println("Bird has been sold");
    }
}

class App {
    public static void main(String [] args){
        SoftDrink cocacola = new SoftDrink();
        cocacola.sell();
        Dog doggo = new Dog();
        doggo.sell();
        Bird birb = new Bird();
        birb.sell();

        //any object that implements the interface can be passed to the method.
        method(cocacola);
        method(doggo);
        method(birb);
    }

    public static void method(SellableItem a) {
        a.sell();
    }
}