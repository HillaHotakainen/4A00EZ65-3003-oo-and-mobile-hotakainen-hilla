class PizzaBox <T>{
    public T thing;
    
    public PizzaBox(T thing){
    this.thing = thing;
    }

    public String toString(){
        return "PizzaBox containing " + this.thing;
    }
}
class Pepperoni {
    public String toString(){
        return "Pepperoni";
    }
    
}

class Tropicana {
    public String toString(){
        return "Tropicana";
    }
}

class Main {
    public static void main(String [] args){
        PizzaBox<Pepperoni> pb1 = new PizzaBox<Pepperoni>(new Pepperoni());
        PizzaBox<Tropicana> pb2 = new PizzaBox<Tropicana>(new Tropicana());
        PizzaBox<String> pb3 = new PizzaBox<String>("Perfetta");
        System.out.println(pb1); // outputs PizzaBox containing Pepperoni
        System.out.println(pb2); // outputs PizzaBox containing Tropicana
        System.out.println(pb3); // outputs PizzaBox containing Perfetta
    } 
}