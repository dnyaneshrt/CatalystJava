package com.catalyst.collection;

import com.catalyst.collection.Address.Address;

public class Employee {
    private int age;
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public Employee(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
}
