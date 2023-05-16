package com.catalyst.collection;

import com.catalyst.collection.Address.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(25,"manoj",new Address(1234,"pune")));
        employees.add(new Employee(17,"neha",new Address(2224,"amaravti")));
        employees.add(new Employee(21,"akshay",new Address(5555,"latur")));
        employees.add(new Employee(34,"akash",new Address(3333,"mumbai")));
        employees.add(new Employee(31,"anand",new Address(1444,"satara")));

        //find list of emps whose age>18.

        System.out.println("all emps are as follows:");
        System.out.println(employees);

        System.out.println("emps whose age>18");
        for(Employee e:employees)
        {
            if(e.getAge()>18)
                System.out.println(e);
        }

        System.out.println("emps whose age<18");
        for(Employee e:employees)
        {
            if(e.getAge()<18)
                System.out.println(e);
        }

        System.out.println("emps whose age>18 && city==mumbai");
        for(Employee e:employees)
        {
            if(e.getAge()>18&&e.getAddress().getCity().equals("mumbai"))
                System.out.println(e);
        }
        //Predicate, Consumer, Function, Supplier.
        System.out.println("emps whose age>18 && city==mumbai..using java 8..");
        employees.stream()
                .filter(e->e.getAge()>18&&e.getAddress().getCity().equals("mumbai"))
                .forEach(System.out::println);

        System.out.println("emps whose age>18 && city==mumbai..using java 8. without using lamda.");
        employees.stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee e) {
                       if(e.getAge()>18&&e.getAddress().getCity().equals("mumbai"))
                        return true;
                       else
                        return false;
                    }
                })
                .forEach(System.out::println);

    }
}
