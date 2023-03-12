public class Main {
    public static void main(String[] args) {
    //creates object of MyRunnable
    MyRunnable r = new MyRunnable();
    
    //creates thread with MyRunnable object
    Thread thread1 = new Thread(r);
    //starts thread1
    thread1.start();
    //creates second thread with MyRunnable object
    Thread thread2 = new Thread(r);
    //starts thread2
    thread2.start();
    }
}

class MyRunnable implements Runnable {
    //run is always the start point of thread, this is what the thread does when it's running
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}