package com.catalyst.string;

public class StringImmutableTest {
    public static void main(String[] args) {
        //immutable, non-synchronized
        String name=new String("java");
        String newString= name.toUpperCase();
        String z= name.concat(" hi");
        System.out.println(name);
        System.out.println(newString);
        System.out.println(z);


        //mutable,synchronized
        StringBuffer s1=new StringBuffer("java");
        s1.append(" hi");
        System.out.println(s1);
    }
}
