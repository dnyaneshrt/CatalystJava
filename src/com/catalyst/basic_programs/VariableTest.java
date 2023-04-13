package com.catalyst.basic_programs;

import com.catalyst.oops_programs.AccModifersTest;

/*3 Types of variables are there in java.
i)Local variable.
-which is declared inside method,constructor or any kind of block is called as local variable.
-local variables must be initialize, if you want to use it.

ii)instance variable.
--which is declared outside method,constructor or any kind of block is called as instance variable.
--instance variables we cannot acees directly inside static context(methods or blocks). we need to create an object to access that.

iii)static variable.
--which is declared outside method,constructor or any kind of block with static keyword is called as static variable.
--static variables we can access using Classname.staticVariableName



*/
public class VariableTest {

    static int num2=111222;//static variable
    VariableTest()
    {
       int num=100;  //local variable
    }
    //instance block
    {
        int num=100; //local variable
    }
    static
    {
        int num=100;//local varible
    }

    int num=999;//instace variable
    //instance method
    void variableTest()
    {
        System.out.println("access public static variable from anather package :"+ AccModifersTest.num);
        int num=111;
        System.out.println("i am from variable Test method: num:-" +num);

        //this keyword refers as current class object
        System.out.println("i am from variable Test method: num:-" +this.num);
    }
    public static void main(String[] args) {
        VariableTest variableTest=new VariableTest();//Object creation(instanciation)
        variableTest.variableTest();//method calling


        int num=100; //local variable.
        System.out.println(num);
        System.out.println("static var value:  "+VariableTest.num2);


    }
}
