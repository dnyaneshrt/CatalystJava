package com.catalyst.collection;

import java.util.*;

//arraylist is growable in nature.
//arraylist maintains insertion order.
//arralist allows duplicate values.
//arraylist allows any no.of null values.
public class ListTest {
    public static void main(String[] args) {

        List students=new ArrayList();  //upcasting..
        students.add("sachin");
        students.add("neha");
        students.add("sonali");
        students.add("manoj");
        students.add("akshay");
        students.add("shekhar");
        students.add("shubham");
        students.add("pritish");
        students.add("nilesh");
        students.add("dnyaneshwar");
        students.add("dnyaneshwar");

        students.add(2,"prince");


        List numbers=new ArrayList();
        numbers.add("10");
        numbers.add("20");
        numbers.add("30");
        numbers.add("40");


        students.addAll(numbers);

        System.out.println( "index 2 is removed :"+students.remove("prince"));
        students.add(101);  //we can add diff type of data elements as well.

        System.out.println(students);

        System.out.println("the student is at index no. 2 is :"+students.get(2));
        System.out.println("total size of my list is :"+students.size());


        System.out.println("traversing list by using Iterator");
        Iterator it=students.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        Collections.sort(students); //will sort in ascendng order

        System.out.println("traversing list by using Iterator after sorting");
        Iterator it1=students.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
      //Collection is an interface.. Collections is class.
        Collections.sort(students, Comparator.reverseOrder()); //will sort in ascendng order

        System.out.println("traversing list by using Iterator after sorting in reverse order");
        Iterator it2=students.iterator();
        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }
        /*

        System.out.println("traversing list by using forEach method");
        students.forEach(s-> System.out.println(s));


        System.out.println("traversing list by using forEach method and method ref (::) variable");
        students.forEach(System.out::println);

        System.out.println("traversing list by using forEach method and method ref (::) variable using stream");
        students.stream().forEach(System.out::println);

        System.out.println("traversing a list using traditional for loop:");
        for(int i=0;i<students.size();i++)
        {
            System.out.println(students.get(i));
        }

        System.out.println("traversing list by using for each loop");
        for(Object student:students)
        {
            System.out.println(student);
        }
*/

    }
}
