package pack2;

public class StaticNestedClasses{
    public static void main(String[] args){
        StaticClass obj1 = new StaticClass();
        obj1.innerInstanceMethod2();
        StaticClass.innerStaticMethod();

        StaticNestedClasses obj2 = new StaticNestedClasses();
        StaticNestedClasses.RegularInnerClass obj3 = obj2.new RegularInnerClass();
        obj3.innerInstanceMethod1();

    }

    static int staticVariable = 20;

    public void instanceMethod(){
        System.out.println("In outer class Instance method");
    }

    public static void staticMethod(){
        System.out.println("In outer class Static method");
    }

    class RegularInnerClass{
        public void innerInstanceMethod1(){
            System.out.println("In Regular inner class method");
            StaticClass sc = new StaticClass();
            sc.innerInstanceMethod2();
            StaticClass.innerStaticMethod();
        }
    }

    static class StaticClass{
        public void innerInstanceMethod2(){
            System.out.println("We can access Static variables and call static methods of outer class directly from Static Nested class : "+staticVariable);
            staticMethod();
        }

        public static void innerStaticMethod(){
            System.out.println("We can access Static variables and call static methods of outer class directly from Static Nested class : "+staticVariable);
            staticMethod();
        }
    }
}