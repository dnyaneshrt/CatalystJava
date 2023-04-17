package com.catalyst.oops_programs;
//method overloading:(Compile time polymorphism)
// in a single class we can have any no.of methods with the same name by passing diff type argument list or
// passing arg list in diff order.

public class MethodOverloadingTest {
    //instace method
    void add()
    {
        System.out.println("i am from zero param add method");
    }
    void add(int num1,int num2)
    {
        System.out.println("i am from 2 param add method: "+(num1+num2));
    }
    void add(int num1,int num2,int num3)
    {
        System.out.println("i am from 3 param add method: "+(num1+num2+num3));
    }

    public static void main(String[] args) {
        MethodOverloadingTest methodOverloadingTest=new MethodOverloadingTest();
        methodOverloadingTest.add();//methoad calling
        methodOverloadingTest.add(10,20);//methoad calling byy passing parms
        methodOverloadingTest.add(10,20,30);//methoad calling by passing parms
    }
}
