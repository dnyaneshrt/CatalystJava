package com.catalyst.oops_programs;

public class BlockTest {
   //instance block
    {
        System.out.println("i am from instance block");
    }
    BlockTest()
    {
        System.out.println("i am from zero param constructor");
    }
    BlockTest(String name)
    {
        System.out.println("i am from param constructor: "+name);
    }
    //static block is used to initialize static variables.
    static {
        System.out.println("i am from static block");
    }
    public static void main(String[] args) {
        System.out.println("i am from main method");
        BlockTest blockTest=new BlockTest();//Object creation
        BlockTest blockTest1=new BlockTest("java");
    }
}
//static block always exceutes before main() method
//before java 1.6v we used get an output without even method.
//static,main(),instance,constructor

