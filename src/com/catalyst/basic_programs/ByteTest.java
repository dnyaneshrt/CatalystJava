package com.catalyst.basic_programs;

public class ByteTest {
    public static void main(String[] args) {
        //Byte requires 1 byte
        //int requires 4 byte
        int num1=100;
        //date 1 to 31...
        byte num=127;  //Byte data type range is -128 to 127.     127,-128,-127

        int result= num+num1;//byte to int(implicit)...  int to byte(explicit)
        num= (byte) (num+5);  //explicit typecasting
        System.out.println(num);
    }
}
