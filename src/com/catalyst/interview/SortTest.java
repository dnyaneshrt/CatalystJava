package com.catalyst.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();

        studentList.add(new Student("sonali","jadhav"));
        studentList.add(new Student("neha","dubey"));
        studentList.add(new Student("manoj","sonwane"));
        studentList.add(new Student("pritish","hande"));
        studentList.add(new Student("akshay","damre"));

//        System.out.println(studentList);
        studentList.stream().forEach(System.out::println);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        });

        System.out.println("all students after sorting..");
        studentList.stream().forEach(System.out::println);

        System.out.println("\n all students after sorting.. using lamda");
        Collections.sort(studentList,(o1,o2)->  o1.getFirstname().compareTo(o2.getFirstname()));
        studentList.stream().forEach(System.out::println);


        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getFirstname().compareTo(o1.getFirstname());
            }
        });

        System.out.println("\n all students after sorting in reverse order..");
        studentList.stream().forEach(System.out::println);


    }

}
