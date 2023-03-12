
class Outer {
    private int x = 12;

    public Inner createInner(){
        return new Inner();
    }

    class Inner {
        public void print(){
            System.out.println(x);
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.createInner();
        inner.print();

        Outer.Inner innerObject = new Outer().new Inner();
        innerObject.print();
    }
}