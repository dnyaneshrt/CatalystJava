package com.catalyst.oops_programs;


class OppoA5
{
  /* final method cannot be overridden.

   final void camera()
    {
        System.out.println("oppo A5 has 32 mp camera");
    }*/
   void camera()
  {
      System.out.println("oppo A5 has 32 mp camera");
  }
    void sim()
    {
        System.out.println("oppo A5 has 2 sim cards");
    }
    void music()
    {
        System.out.println("good");
    }
}
class OppoA9 extends OppoA5
 {
     @Override
     void camera()
     {
         System.out.println("oppo A9 has 64 mp camera");
     }

 }
public class MethodOverridingTest {
    public static void main(String[] args) {
//     OppoA9 a9=new OppoA9();
        OppoA5 a5=new OppoA9(); //upcasting in java.. (holding child object ito parent class refernce.)
        a5.camera();
        a5.sim();
        a5.music();
    }
}
