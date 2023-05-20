package com.catalyst.interview;

//String immutability means:  we cannot change.
//why?  for security reasons
public class StringTest {
    public static void main(String[] args) {
        String name="abc";
        String newName=name.concat("xyz");
        System.out.println(newName);
        System.out.println(name);//abcxyz or abc.

        System.out.println("stringbuffer....");
        StringBuffer sb=new StringBuffer("abc");
        sb.append("xyz");
        System.out.println(sb);
    }
}
