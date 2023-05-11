package com.catalyst.exception_handling;

public class ThrowsTest {
   public static void test() throws InterruptedException
   {
       Thread.sleep(1000);
   }
    public static void main(String[] args) throws InterruptedException {
     ThrowsTest.test();
    }
}
