
package fi.tuni;  // Car.java must be inside of fi/tuni

public class Car {
    private String car;
    private Engine engine;

    public Car(String car, int engine){
        setCarBrand(car);
        this.engine = new Engine(engine);
    }

    public void setCarBrand(String car){
        this.car = car;
    }

    public String toString(){
        return "Brand: " + this.car + ", " + this.engine;
    }
}