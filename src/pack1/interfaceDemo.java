package pack1;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@FunctionalInterface
interface FunInterface{
    public void m1();

    default void m3(){
        System.out.println("Im inside Functional Interface");
    }
}

interface InterfaceDemo1 { // InterfaceDemo2.super.m3
    void m1();//public & abstract
    void m2();
    default void m3(){ //public
        System.out.println("I'm inside Default1 method");
    }

    static void m4(){ //public
        System.out.println("I'm inside static1 method");
    }
}

interface InterfaceDemo2 {
    void m1();
    void m2();
    default void m3(){
        System.out.println("I'm inside Default2 method");
    }

    static void m4(){
        System.out.println("I'm inside static2 method");
    }
}

class InterfaceImplementation implements InterfaceDemo1,InterfaceDemo2{
    @Override
    public void m1() {
        System.out.println("I'm inside m1 method");
    }

    @Override
    public void m2() {
        System.out.println("I'm inside m2 method");
    }

    @Override
    public void m3() {
        //child implementation
        System.out.println("I'm inside Default3 method");

        //Parent implementation
        InterfaceDemo1.super.m3();
        InterfaceDemo2.super.m3();
    }

    static void m4(){
        System.out.println("I'm inside static3 method");
    }

    public static void main(String[] args) {
        InterfaceImplementation obj = new InterfaceImplementation();
        obj.m3();
        InterfaceDemo1.m4();
    }
}
