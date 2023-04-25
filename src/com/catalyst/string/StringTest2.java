package com.catalyst.string;

public class StringTest2 {
    public static void main(String[] args) {
      String test="The methods or variables defined as static are shared among all the objects of the class. The static is the part of the class and not of the object. The static variables are stored in the class area, and we do not need to create the object to access such variables. Therefore, static is used in the case, where we need to define variables or methods which are common to all the objects of the class.";
      System.out.println("the length of above string is: "+test.length());

    /*  for(int i=0;i<test.length();i++)
      {
          System.out.println((i+1)+" "+test.charAt(i));
      }*/

     /*   System.out.println(test.replace('.','@'));

       String[] setences= test.replace('.','@').split("@");

       */

  //2 ways to work with dot(.) in Java split() method..
//       String[] setences=test.split("[.]");
       String[] setences=test.split("\\.");
       for(String s:setences)
       {
           System.out.println(s);
       }

       //count total number of words.

     /*  String[] words= test.split(" ");
       int count=0;
       for(String w:words)
       {
           count++;
           System.out.println(count+" "+w);
       }*/

    }
}
