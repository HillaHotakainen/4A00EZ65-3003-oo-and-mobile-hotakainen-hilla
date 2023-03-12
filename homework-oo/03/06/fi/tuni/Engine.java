package fi.tuni;  // Car.java must be inside of fi/tuni

public class Engine {
    int horsePower = 0;

    public Engine(int power){
        setEnginePower(power);
    }

    public void setEnginePower(int power){
        this.horsePower = power;
    }

    public String toString(){
        return "engine power: " + this.horsePower;
    }
}