package com.catalyst.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSortTest {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("sonali", "jadhav"));
        employeeList.add(new Employee("neha", "dubey"));
        employeeList.add(new Employee("manoj", "sonwane"));
        employeeList.add(new Employee("pritish", "hande"));
        employeeList.add(new Employee("akshay", "damre"));

        System.out.println("before sorting");
        employeeList.stream().forEach(System.out::println);
        Collections.sort(employeeList);

        System.out.println("after sorting");
        employeeList.stream().forEach(System.out::println);


        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getLastname().compareTo(o1.getLastname());
            }
        });

        System.out.println("after sorting in desc order based on lastna using comparator::");
        employeeList.stream().forEach(System.out::println);


        Collections.sort(employeeList, (o1, o2) -> {
            return o2.getLastname().compareTo(o1.getLastname());
        });


        System.out.println("after sorting in desc order based on lastname using comparator::  lamda");
        employeeList.stream().forEach(System.out::println);


        employeeList.stream()
                .sorted((o1, o2) -> o1.getLastname().compareTo(o2.getLastname()))
                .forEach(System.out::println);

        System.out.println("after sorting in desc order based on lastname using comparator::  lamda.. using stream");
        employeeList.stream().forEach(System.out::println);


    }
}
