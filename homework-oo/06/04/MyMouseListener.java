
interface MyMouseListener {
    public void mouseEntered();
    public void mouseExited();
}

class MyWindow implements MyMouseListener {
    @Override
    public void mouseEntered(){
        System.out.println("mouse entered");
    }
    @Override
    public void mouseExited(){
        System.out.println("mouse exited");
    }
}