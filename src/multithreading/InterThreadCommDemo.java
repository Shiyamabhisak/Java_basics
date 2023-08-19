package multithreading;

public class InterThreadCommDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread10 mt1 = new MyThread10();
        mt1.start();
        synchronized (mt1){
            System.out.println("Main trying to call wait method");
            mt1.wait();
            System.out.println("Main thread got notification");
            System.out.println(mt1.total);
        }
    }
}

class MyThread10 extends Thread{
    int total;
    public void run(){
        synchronized (this){
            System.out.println("child thread doing calculation");
            for(int i = 0;i<=100000000;i++){
                total += i;
            }
            System.out.println("Child thread sent notification");
            notify();
        }
    }
}
