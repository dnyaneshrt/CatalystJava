package com.catalyst.oops_programs;

public class ThisTest {
    int num=999;   //instance variables
    ThisTest()
    {
        //this() inside constructor always must be the first line.
        this(25);// this keyword at constructor level.. it is also used to call anather constructor in same class even by passing params
        System.out.println("i am from zero param constructor:");
    }
    ThisTest(int num)
    {
        System.out.println("from 1 param cons  :"+num);
    }

    //instance method/instance area
    void printDetails()
    {
        System.out.println("from printDetails method");
        int num=888; //local variable
        System.out.println(num); //888
        System.out.println(this.num); // 999  this keyword at varibale level
        this.test(); //this keyword at method level
    }
    void test()
    {
        System.out.println("i am from test instance method");
    }
    //static method/static area
    public static void main(String[] args) {
        ThisTest thisTest=new ThisTest(); //this object will ero param constructor
        System.out.println(thisTest.num);
      //  System.out.println(this.num); this keyword cannot be refered from static context..
        thisTest.printDetails();

    }
}

