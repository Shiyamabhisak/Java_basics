package multithreading;

class OddOrEven{
    public static void main(String[] args) {
        PrintOddEvenNos printOddEvenNos = new PrintOddEvenNos(100);
         new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printOddEvenNos.printOddNos();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printOddEvenNos.printEvenNos();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}

class PrintOddEvenNos{
    int maxLimit,num;

    PrintOddEvenNos(int maxLimit){
        this.maxLimit = maxLimit;
        num = 1;
    }

    public synchronized void printOddNos() throws InterruptedException {
        while (num <= maxLimit) {
            if (num % 2 == 1) {
                System.out.println("Printing Odd Number : " + num++);
            } else {
                notify();
                this.wait(1000);
            }
        }
    }

    public synchronized void printEvenNos() throws InterruptedException {
        while(num<=maxLimit){
            if(num % 2 == 0){
                System.out.println("Printing Even Number : "+num++);
            }
            else{
                notify();
                this.wait(1000);
            }
        }
    }
}
