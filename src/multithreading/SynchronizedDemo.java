package multithreading;

public class SynchronizedDemo {
    public static void main(String[] args) {
        TestSync ts1 = new TestSync();
        TestSync ts2 = new TestSync();
        MyThread9 obj1 = new MyThread9(ts1);
        MyThread9 obj2 = new MyThread9(ts2);
        obj1.start();
        obj2.start();
    }
}

class TestSync{
    public static synchronized void print() throws InterruptedException {
        for (int i = 1;i<5;i++) {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " -  Calling Static Synchronized Method");
        }
    }

    public synchronized void print2() throws InterruptedException {
        for (int i = 1;i<5;i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " -  Calling Synchronized Method");
        }
    }
}

class MyThread9 extends Thread{
    TestSync obj;
    MyThread9(TestSync obj){
        this.obj = obj;
    }
    public void run(){
        try {
            obj.print2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            TestSync.print();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
