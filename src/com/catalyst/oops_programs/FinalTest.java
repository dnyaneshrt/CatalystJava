package com.catalyst.oops_programs;
/*final Modifier.
final modifier is applicable for variable, methods and classes.
i] if you declare variable as final, we cannot modify that variable's value.. (cannot re-initialize)
ii] if you declare any method as final, we cannot override that method...
iii] if you declare any class as final, we cannot extend any other class from that class*/
public class FinalTest {
    public static void main(String[] args) {
        final int num=100;
//        num=101; // re-assign
        System.out.println(num);
    }
}
