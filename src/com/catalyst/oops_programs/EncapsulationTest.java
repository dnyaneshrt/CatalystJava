package com.catalyst.oops_programs;
/*Encapsulation:  it is mechanism of data hiding and provides public method/interfaces (Getter/Setter) to access that data from other classes*/
//all private members = tighly encapsulated class.
//some private memers = loosley encapsulated class.

class Manoj
{
    //it is mechanism of hiding data.. by making all data members as private.
    //it is always recommended to make your instance variables as private.
   private int age;
   private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0)
        {
            System.out.println("please enter valid age:");
        }else {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //any logic
        this.name = name;
    }
}
public class EncapsulationTest {
    public static void main(String[] args) {
        Manoj manoj=new Manoj();
        manoj.setAge(22);
        manoj.setName("Manoj");
        System.out.println("age: "+manoj.getAge()+" name: "+manoj.getName());

        Manoj manoj2=new Manoj();
        manoj2.setAge(-22);
        manoj2.setName("Manoj2");
        System.out.println("age: "+manoj2.getAge()+" name: "+manoj2.getName());
    }
}
