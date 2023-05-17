package com.catalyst.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//map is used to store data in key,value pair..
//hashMap does not maintain the insertion order.
//map does not allow duplicate keys, you can have duplicate values in map.
//as key only one null value is allowed in map., as value any number of null values are allowed.

public class MapTest {
    public static void main(String[] args) {
     /*   Map<Integer,String> students=new HashMap<>();*/
        Map<Integer,String> students=new TreeMap<>();
        students.put(14,"sachin");
        students.put(14,"neha");
        students.put(15,"sonali");
        students.put(16,"neha");
        students.put(10,"manoj"); //adding data using put() method
        students.put(12,"shekhar");
        students.put(13,"akshay");

       /* students.put(null,null);
        students.put(159,null);*/

        System.out.println(students);
        System.out.println("total students are: "+students.size());

        Set<Map.Entry<Integer,String>> student=students.entrySet();
        for(Map.Entry m:student)
        {
            System.out.println(m.getKey()+" ::  *"+m.getValue()+"*");
        }

        System.out.println("--------------------");
        System.out.println(students.get(15));
        students.replace(15,"sonali","shubham");

        System.out.println("after replacing..");

        for(Map.Entry m:student)
        {
            System.out.println(m.getKey()+" ::  *"+m.getValue()+"*");
        }
        System.out.println(students.keySet());
        System.out.println(students.values());
        students.clear();
        System.out.println("total students after clearing are: "+students.size());


    }
}
