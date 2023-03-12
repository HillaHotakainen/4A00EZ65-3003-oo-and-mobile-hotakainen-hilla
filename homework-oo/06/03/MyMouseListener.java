
interface MyMouseListener {
    public void mouseEntered();
    public void mouseExited();
}

class MyWindow implements MyMouseListener {
    public void mouseEntered(){
        System.out.println("mouse entered");
    }
    public void mouseExited(){
        System.out.println("mouse exited");
    }
}