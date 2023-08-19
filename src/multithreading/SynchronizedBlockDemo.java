package multithreading;

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Sync ts1 = new Sync();
        Sync ts2 = new Sync();
        MyThread8 obj1 = new MyThread8(ts1);
        MyThread8 obj2 = new MyThread8(ts2);
        obj1.start();
        obj2.start();
    }
}

class Sync{
    public void print() throws InterruptedException {
        synchronized (Sync.class) {
            for (int i = 1; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " -  Calling Static Synchronized Method");
            }
        }
    }

    public void print2() throws InterruptedException {
        synchronized (this) {
            for (int i = 1; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " -  Calling Synchronized Method");
            }
        }
    }
}

class MyThread8 extends Thread{
    Sync obj;
    MyThread8(Sync obj){
        this.obj = obj;
    }
    public void run(){
        try {
            obj.print2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            obj.print();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
