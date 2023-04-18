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

 /*   Number camera()
  {
      System.out.println("oppo A5 has 32 mp camera");
      return 0;
  }*/
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
   /* Integer camera()
     {
         System.out.println("oppo A9 has 64 mp camera");
         return 0;
     }*/

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


/*Advantages of Covariant Return Type

//can we change the return types in overloading?    yes[Covariant Return Type]
1) Covariant return type assists to stay away from the confusing type casts in the class hierarchy and makes the code more usable, readable, and maintainable.
2) In the method overriding, the covariant return type provides the liberty to have more to the point return types.
3) Covariant return type helps in preventing the run-time ClassCastExceptions on returns.
*/