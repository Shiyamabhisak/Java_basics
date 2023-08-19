package accessModifiers2;

import accessModifiers.Parent;

public class Child extends Parent {

   protected void m1() {

       Child c1 = new Child();
       System.out.println(k);
   }

   public void m2(){
       System.out.println(i);
   }

   void m3(){

   }

   private void m4(){

   }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m2();
        obj.m1();
    }

}
