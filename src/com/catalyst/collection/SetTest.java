package com.catalyst.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//set does not maintains insertion order.
//set does not allows duplicate values.
//set allows only one null value.
public class SetTest {
    public static void main(String[] args) {
//        Set numbers=new HashSet();
        Set<Integer> numbers=new TreeSet();
        numbers.add(1023);
        numbers.add(135340);
        numbers.add(1310);
        numbers.add(198060);
        numbers.add(147560);
        numbers.add(1077);
        numbers.add(1088);
        numbers.add(1077);
        numbers.add(1088);
        numbers.add(10990);
        System.out.println(numbers);

        System.out.println("numbs>9999");
        numbers.stream().filter(n->n>9999).forEach(System.out::println);

    }
}
