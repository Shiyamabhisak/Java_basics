package multithreading;

import java.sql.SQLOutput;

public class NameDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        MyThread3 mt3 = new MyThread3();
        mt3.start();
        Thread.currentThread().setName("Parent Thread");
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread3 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Child Thread");
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
    }
}
