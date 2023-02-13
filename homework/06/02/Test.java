
class Outer {
    private int x = 12;

    /* public Inner createInner(){
        return new Inner();
    } */

    public void doSomething(){

        int a = 12;
        final int b = 99;
        int c = 23;
        c = 99;

        class Inner {
            public void print(){
                System.out.println(a);
                System.out.println(b);
                //can not use c, c is kind afinal so you can not modify it
                //System.out.println(c);
            }
        }
        Inner inner = new Inner();
        inner.print();
        
    }
    
}

class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.doSomething();
    }
}