package multithreading;

public class ThreadClassDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 mt1 = new MyThread1(); //instantiating the thread
        mt1.start(); // starting the thread
        //mt1.start() -> If we try to start the thread again then IllegalThreadStateException is thrown at runtime.
        System.out.println("I'm Parent Thread");


    }
}


//Defining a thread
class MyThread1 extends Thread{
    //job of the thread
    public void run(){
        System.out.println("I'm Extending thread class");
    }
}

/*
*
*
* new  ->   Runnable    ->     Running    ->     Dead
*
*           Runnable -> Thread     new Thread(Runnable r)
*
*
* */