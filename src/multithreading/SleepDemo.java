package multithreading;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread7 mt7 = new MyThread7();
        mt7.start();
        for(int i = 0;i<10;i++){
            System.out.println("Execution of Main Thread " + i);
            mt7.interrupt();
        }
    }
}

class MyThread7 extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("Testing Sleep Method " + i);
//            try {
//                //Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println("Sleep Interrupted " + i);
//            }
        }
    }
}