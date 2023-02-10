
import java.util.ArrayList;
import java.util.List;

interface SellableItem {
    void sell();
}

class Store {
    private String name;
    private List<SellableItem> itemsOnSale;

    public Store(String name){
        setName(name);
        itemsOnSale = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    void addSellableItem(SellableItem si){
        itemsOnSale.add(si);
    }

    void removeSellableItem(SellableItem si){
        itemsOnSale.remove(si);
    }

    SellableItem getSellableItem(int i){
        return itemsOnSale.get(i);
    }

    void sellAllItems(){
        for(SellableItem si : itemsOnSale){
            si.sell();
        }
        System.out.println("everything is now sold");
    }
}

class SoftDrink implements SellableItem {
    @Override
    public void sell() {
        System.out.println("Softdrink has been sold");
    }

    @Override
    public String toString() {
        return "Soft drink";
    } 
}

class Dog implements SellableItem {
    @Override
    public void sell() {
        System.out.println("Dog has been sold");
    }

    @Override
    public String toString() {
        return "Dog";
    } 
}

class Bird implements SellableItem {
    @Override
    public void sell() {
        System.out.println("Bird has been sold");
    }

    @Override
    public String toString() {
        return "Bird";
    } 
}

class App {
    public static void main(String [] args){
        Store store = new Store ("is-A-Store");
        SoftDrink cocacola = new SoftDrink();
        Dog doggo = new Dog();
        Bird birb = new Bird();

        System.out.println(store.getName());

        store.addSellableItem(cocacola);
        store.addSellableItem(doggo);
        store.addSellableItem(birb);
        System.out.println(store.getSellableItem(0));
        System.out.println(store.getSellableItem(1));
        System.out.println(store.getSellableItem(2));

        store.removeSellableItem(doggo);
        System.out.println(store.getSellableItem(0));
        System.out.println(store.getSellableItem(1));

        store.sellAllItems();
    }

}