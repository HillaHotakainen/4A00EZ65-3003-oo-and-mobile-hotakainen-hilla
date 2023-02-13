
interface Sellable {
    public void sell();
}

class Computer implements Sellable {
    @Override
    public void sell(){
        System.out.println("Something sold");
    }
}