package pack2;

public class RegularInnerClasses {
    public static void main(String[] args) {
        //access inner class method from instance method of outer class
        Car obj1 = new Car();
        obj1.m2();

        //access inner class method from static method of outer class
        Department.commonDepts();

        Department dept = new Department();
        Department.CSE cse = dept.new CSE();
        cse.java();

        //access inner class method from instace method outside the outer class
        new RegularInnerClasses().m3();

        //access directly through object - inner class can access the outer class members directly
        new Outer().new Inner().m1();

        //nested inner classes
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        A.B.C.D d = c.new D();
        A.B.C.D.E e = d.new E();
        e.eMethod();

    }

    //Instance method outside the outer class - Need to create instance for outer class 1st then create instance for inner class then access the inner class method
    public void m3(){
        Department dept = new Department();
        Department.CSE cse = dept.new CSE();
        cse.java();
    }
}

//outer class
class Car{
    //Inner class
    class Engine{
        //instance method of inner class
        public void m1(){
            System.out.println("Inner Class");
        }
    }
    //Instance method of outer class - we can simply create an object for inner class and call it
    public void m2(){
        Engine eng = new Engine();
        eng.m1();
        System.out.println("Outer Class");
    }
}
//outer class
class Department{
    //Inner class
    class CSE{
        //instance method of inner class
        public void java(){
            System.out.println("Inner Class");
        }
    }
    //Need to create instance for outer class 1st then create instance for inner class then access the inner class method
    public static void commonDepts(){
        Department dept = new Department();
        Department.CSE cse = dept.new CSE();
        cse.java();
        System.out.println("Outter Class");
    }
}

class Outer{
    //non-static member
    int x = 5;
    //static member
    static int y = 10;
    class Inner{
        //both static and non-static members can be accessed directly - this refers to inner class instance & outer.this refers to outer class reference
        public void m1(){
            Outer.this.x = 8;
            System.out.println(x);
            y = 12;
            System.out.println(y);
            m2();
            m3();
        }
    }
    public void m2(){
        System.out.println("Inner class can access non-static members of outer class");
    }
    public static void m3(){
        System.out.println("Inner class can access both static members of outer class");
    }
}

//Nested inner classes
class A{
    class B{
        class C{
            class D{
                class E{
                    void eMethod() {
                        System.out.println("NESTED INNER CLASSES");
                    }
                }
            }
        }
    }
}

//Inner Class - Class - Class - Object - Object.innerObject

/*

K -> V
1 -> A -> Entry
2 -> B
3 -> C

interface HashMap{
    interface Entry{
    }
}
 */