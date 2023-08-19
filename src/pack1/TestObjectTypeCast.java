package pack1;


public class TestObjectTypeCast {

    public static void main(String args[]){
        Parent1 p = new def2();

        //child2 c2 = (child2)p;
        //def1 d1 = (def4)p;
        child1 c1 = (def2)p;

        def1 obj = new def1();

        obj.m1(); //def1 type ; def1 internal object type
        ((child1)obj).m1(); //child1 type ; def1 internal object type
        ((Parent1)obj).m1(); //Parent1 type ; def1 internal object type

    }
}

class Parent1{
    public void m1(){
        System.out.println("PARENT");
    }
}

class child1 extends Parent1{
    public void m1(){
        System.out.println("CHILD");
    }
}

class child2 extends Parent1{

}

class def1 extends child1{
    public void m1(){
        System.out.println("def");
    }
}

class def2 extends child1{

}

class def3 extends child2{

}

class def4 extends child2{

}
