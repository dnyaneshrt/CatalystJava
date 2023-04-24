package com.catalyst.string;

public class StringRevTest {
    public static void main(String[] args) {
        String name="sonu";
        String rev="";
        System.out.println(rev.isEmpty());
        //3,2,1,0
        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        System.out.println(rev.isEmpty());

        String string="level";
        System.out.println("ev contains: "+string.contains("ev"));
        System.out.println("ew contains: "+string.contains("ew"));

        if(isPalindrome(string))
            System.out.println("it's palindrome");
        else
            System.out.println("it's not palindrome");
    }
    private static boolean isPalindrome(String string) {
        String rev="";
        for(int i=string.length()-1;i>=0;i--)
        {
            rev=rev+string.charAt(i);
        }
        if(string.equals(rev))
            return  true;
        else
            return  false;
    }
}
