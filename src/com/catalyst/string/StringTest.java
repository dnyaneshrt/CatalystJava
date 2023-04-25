package com.catalyst.string;
//String : is pre-defined class in Java.
//StringTest is user defined class.

//String in java is used to represent group of chars.
//char:  'a','b','c','1','2','@','*'.
//char[] =String
//2 ways to create String in java.
/*1. String var_name="any string";  //using string literal
* 2. String var_name=new String("any String");  //by using new keyword
*
* length() gives the count of total chars avaliable in String (including space and any chars as well).
* charAt(index); gives the character for given index.
* s.indexOf('g');  will give the index of specified character.
* s2.equals(s3): will check equality of string based on content.
* */
public class StringTest {
    public static void main(String[] args) {
     String s="Java is great langauge";
     System.out.println("total length of above String is:"+s.length());
     char third_char=s.charAt(2);
     System.out.println("the character at index 2 is "+third_char);
     char fiftenth_char=s.charAt(15);
     System.out.println("the character at index 15 is "+fiftenth_char);
     int index=s.indexOf('g');
     System.out.println("index of 'g' is "+index);

     String s2="java";
     String s3="Java";
     System.out.println(s2.equals(s3));
     System.out.println(s2.equalsIgnoreCase(s3));

     System.out.println(s.toLowerCase());
     System.out.println(s.toUpperCase());

     System.out.println(s.substring(5));
     System.out.println(s.substring(5,9));

     System.out.println(s.replace('a','*'));
     System.out.println(s.replace("Java","cccc"));

     System.out.println(s+ " ::hi everyone");
     System.out.println(s.concat(":: welcome evreyone"));

     String s4="java ";
     System.out.println(s4.length());
     //trim() method is used to remove white spaces from both sides of the string.
     System.out.println(s4.trim().length()); //


    }
}
