package multithreading;

public class RunnableInterfaceDemo{
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2(); //Instantiating the thread
        Thread t1 = new Thread(mt2);
        t1.start();//Starting the thread
        System.out.println("I'm in main thread");
    }
}

//Defining a thread
class MyThread2 implements Runnable{
    //job of the thread
    public void run(){
        System.out.println("I'm in child thread");
    }
}
