package pack2;

import pack1.*;
public class AnonymousInnerClass {

    static int instanceVariable = 20;
    //One time usage - only one object of the class is required
    public static void main(String[] args) {
        int localVariable = 10;

        AnonymousClass ac = new AnonymousClass();
        ac.classMethod();

        //Anonymous inner class that implements an interface
        AnonymousInterface ai = new AnonymousInterface(){
            @Override
            public void interfaceMethod() {
                System.out.println("Inner-Class method2 "+ localVariable +" "+ instanceVariable);
            }
        };
        ai.interfaceMethod();

        //Anonymous inner class defined inside method arguments - new Thread(new Runnable(){
        //* public void run(){
        //*
        //* }
        //* });

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(localVariable + " " + (i+1));
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).run();
    }
}

class AnonymousClass{
    int instanceVariable = 15;
    public void classMethod(){
        int localVariable = 25;
        System.out.println("Class method");
        //Anonymous inner class that extends a class
        AnonymousClass ac = new AnonymousClass(){
            public void classMethod(){
                System.out.println("Inner-Class method1 " + localVariable +" "+ instanceVariable);
            }
        };
        ac.classMethod();
    }

}

interface AnonymousInterface{
    void interfaceMethod();
}