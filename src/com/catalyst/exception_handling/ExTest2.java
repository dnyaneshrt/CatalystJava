package com.catalyst.exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         try
         {
             System.out.println("please enter first number");
             int num1=sc.nextInt();
             System.out.println("please enter second number");
             int num2=sc.nextInt();
             System.out.println("addition of above two numbes are: "+(num1+num2));
         }catch(ArrayIndexOutOfBoundsException | InputMismatchException | ArithmeticException a)
         {
             System.out.println("please enter valid input");
         }
    }
}
