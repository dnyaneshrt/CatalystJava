package com.catalyst.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest2 {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(11,"shekhar","padalakar","sangali"));
        students.add(new Student(12,"akshay","dambre","buldhana"));
        students.add(new Student(13,"neha","dubey","Amaravati"));
        students.add(new Student(14,"sonali","jadhav","nashik"));
        students.add(new Student(15,"sachin","mote","sangali"));
        students.add(new Student(16,"Manoj","sonwane","shirdi"));
        students.add(new Student(11,"shekhar","padalakar","sangali"));
        students.add(new Student(12,"akshay","dambre","buldhana"));
        students.add(new Student(13,"neha","dubey","Amaravati"));
        students.add(new Student(14,"sonali","jadhav","nashik"));
        students.add(new Student(15,"sachin","mote","sangali"));
        students.add(new Student(16,"Manoj","sonwane","shirdi"));

        System.out.println("Total no.of students: "+students.size());
        students.forEach(System.out::println);

        //my requirement to print only those students whose name starts with 's'.
        System.out.println("students whose firstname starts with 's' is below:");
        for(Student s:students)
        {
            if(s.getFirstname().startsWith("s"))
            {
                System.out.println(s);
            }
        }
      // Collections.sort(students); //it won't sort.. for this we have to use either comparator or Comparable.

        System.out.println("students whose firstname starts with 's' is below using java 8:");
        students.stream().filter(s->s.getFirstname().startsWith("s")).forEach(System.out::println);

        System.out.println("students from sangali count:");
        System.out.println(students.stream().filter(s->s.getAddress().equals("buldhana")).count());


    }
}
