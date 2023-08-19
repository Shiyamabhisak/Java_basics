package pack2;

public class MethodLocalInnerClass {
    //This type of inner class is used when we want to use repeated method specific functionality
    int instanceVariable = 10;
    static int staticVariable = 20;

    public static void main(String[] args) {
        MethodLocalInnerClass mlic = new MethodLocalInnerClass();
        mlic.instanceMethod();


        MethodLocalInnerClass.staticMethod();

    }

    public void summaInstance(){

    }

    public static void summaStatic(){

    }

    public void instanceMethod(){
        //local variable must be final till jdk 1.7 only
        int localVariable = 15;

        //class cannot be public -
        class InnerClass{
            public void innerInstanceMethod(){
                System.out.println("Method Local Inner Class accessed from Instance Method. All variables can be accessed directly: " + localVariable + " " +  instanceVariable + " " +  staticVariable);
                summaInstance();
                summaStatic();
            }
        }

        InnerClass ic = new InnerClass();
        ic.innerInstanceMethod();
    }

    public static void staticMethod(){
        int localVariable = 15;
        class InnerClass{
            public void innerInstanceMethod(){
                System.out.println("Method Local Inner Class accessed from Static method. Static variables alone can be accessed:  " + localVariable + " " + staticVariable); //Can only access static variable
                summaStatic();
            }
        }
        InnerClass ic = new InnerClass();
        ic.innerInstanceMethod();
    }
}
/*

class A{
void operation(){
class B{
void sum(int a, int b){}
}
B obj = new B();
obj.sum();
}
}

Main(){
A obj = new A():








* */