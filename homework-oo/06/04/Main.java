
class Main {
   public static void main(String [] args) {
      //can contain either new shape or rectangle because not abstract
      Shape shape1 = new Shape();
      Shape shape2 = new Rectangle();
      //can only contain Dog because Mammal is abstract
      Mammal mammal = new Dog();
      //can only contain computer because Sellable is interface
      Sellable sellable = new Computer();
      //can only contain MyWindow because MyMouseListener is interface
      MyMouseListener myMouseListener = new MyWindow();
   }
}