package com.catalyst.exception_handling;

public class ExTest1 {
    public static void main(String[] args) {
        Integer[] numbers=new Integer[]{1,2,3,4,56,5,4,8};
        System.out.println("size of above array :"+numbers.length);

        try {
            System.out.println(numbers[8]);

        }
       /* catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("111111111111");
        }*/
        catch(Throwable e)
        {
            System.out.println("222222222222");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("imp code.. finally code");
        }
        System.out.println("1000 lines of imp code");
    }
}
