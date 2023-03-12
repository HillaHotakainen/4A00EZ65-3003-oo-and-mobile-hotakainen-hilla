
class Main {
   public static void main(String [] args) {
      final int number = 1234;
      final String sound = "sounds wow"; 


      abstract class Mammal {
         public void giveBirth() {
            //can use outer classes atributes as long as they are final or effectively final
            System.out.println(sound);
         }
         abstract void makeSound();
      }

      class Dog extends Mammal {
         @Override
         public void makeSound() {
            System.out.println(sound);
         }
      }
      
      interface MyMouseListener {
         public void mouseEntered();
         public void mouseExited();
      }

      class MyWindow implements MyMouseListener {
         @Override
         public void mouseEntered(){
            System.out.println(sound);
         }
         @Override
         public void mouseExited(){
            System.out.println(sound);
         }
      }

      interface Sellable {
         public void sell();
      }

      class Computer implements Sellable {
         @Override
         public void sell(){
            System.out.println(sound);
         }
      }

      class Shape {
         //can use outer classes atributes as long as they are final or effectively final
         public int x = number;
         public int y = number;
      }

      class Rectangle extends Shape {
         public int width = number;
         public int height = number;
      }
      
      Shape shape = new Shape();
      System.out.println(shape.x);
      Mammal mammal = new Dog();
      mammal.makeSound();
      mammal.giveBirth();
      Sellable sellable = new Computer();
      
      Shape shape1 = new Shape() {
         int x = 1;
         };
      //must have the abstract makeSound method made to work
      Mammal mammal1 = new Mammal(){
            public void makeSound() {
                  System.out.println(sound);
            }
      };
      //must have the methods that the interface has
      Sellable sellable1 = new Sellable() {
            public void sell() {
                  System.out.println("Sell stuff");
            }
         };

      //must have the methods that the interface has
      MyMouseListener myMouseListener = new MyMouseListener() {
            public void mouseEntered() {
                  System.out.println("Mouse is here");}
            public void mouseExited() {
                  System.out.println("Mouse awayyyyy");}
      };
   }
}