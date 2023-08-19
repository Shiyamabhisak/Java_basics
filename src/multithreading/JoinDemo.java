package multithreading;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 mt6 = new MyThread6();
        mt6.start();
        mt6.join(); // main thread moves to waiting state
        System.out.println("Execution of Main thread");
    }
}

class MyThread6 extends Thread{
    public void run(){
        System.out.println("Testing Join method");
    }
}
