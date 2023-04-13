package com.catalyst.oops_programs;
/*public: is an access modifier which is applicable for varibales,class and methods.
if we declared variable,class or method as public we can access that all over the peoject

private members we can access within that same class only
*/
public class AccModifersTest {
    public static int num=777; //static variable.  public

    public static void main(String[] args) {
//        System.out.println(VarTest.num);  cannot access
    }
}
class VarTest
{
   private static int num=888;//private
   static int num2=555; //default (package level) accessible in same package only
}
