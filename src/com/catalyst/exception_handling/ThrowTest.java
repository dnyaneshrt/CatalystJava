package com.catalyst.exception_handling;

public class ThrowTest {
    public static void test()
    {
        int age=15;
        if(age>18)
        {
            System.out.println("he can vote");
        }else {
            try {
                throw new CannotVoteException("you are not eligible for voting..");
            } catch (CannotVoteException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        ThrowTest.test();
    }
}
