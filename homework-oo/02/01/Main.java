class Main {
    public static void main(String [] args){
        Point pojo = new Point();
        System.out.print(pojo.x); //Prints 0 because default value for int is 0
        System.out.println(pojo.y); //Prints 0 because default value for int is 0

        Point origo1 = new Point();
        Point origo2 = origo1;
        System.out.println(origo2);//Prints the memory spot of origo1

        origo1.printMe();//prints origo1 memory spot since this is refering to it 
        System.out.println(origo1); //prints origo1 that only contains the memory spot??
    } 
}
