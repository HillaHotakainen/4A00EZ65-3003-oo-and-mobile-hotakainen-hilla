class Box <T>{
    public T example;
}

class Main {
    public static void main(String [] args){
        Box<String> strings = new Box<String>(); //works because String is class.
        strings.example = "ayyy";
        Box<Integer> ints = new Box<Integer>(); //on background converts Integer to int and then back to Integer so it can be used, this is autoboxing.
        ints.example = 10;
        Box<Double> dupes = new Box<Double>(); //on background converts Double to double and then back to Double. amazing.
        dupes.example = 11.22;
        //Box<int> sad = new Box<int>(); //does not work because autoboxing can only handle classes. wow.
    } 
}