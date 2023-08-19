package multithreading;

public class PriorityDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        MyThread4 mt4 = new MyThread4();
        mt4.start();
        Thread.currentThread().setPriority(1);
        System.out.println(Thread.currentThread().getPriority());
    }
}

class MyThread4 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread().getPriority());
    }
}