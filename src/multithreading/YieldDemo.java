package multithreading;

public class YieldDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 mt51 = new MyThread5();
        MyThread5 mt52 = new MyThread5();
        mt51.start();
        mt52.start();
        for(int i = 0;i<20;i++) {
            Thread.yield();
            System.out.println("Execution of Main Thread");
        }
    }
}

class MyThread5 extends Thread{
    public void run(){
        for(int i = 0;i<10;i++) {
            Thread.yield();
            System.out.println("Testing Yield method " + Thread.currentThread().getName());
        }
    }
}
