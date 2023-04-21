package com.catalyst.oops_programs;
/*abstraction:  showing only  functionalities and hiding internal details.

it is the process of knowing imp details to be known and ignoring non-imp details..to be focused on.
* */
//abstract class and interface is used to achieve abstraction in java.
//asbtract class is used to achieve partial abstraction where as interface is used to achieve fully abstraction in java.
//"abstract" keyword/modifier is used to abstract class.
//the methods which does not have body are called as abstract methods.
//only abstract classes can have abstract methods as well as concrete methods.
//we can never create an Object of abstract classes. and interfaces...
//the subclasses of abstract classes are responsible to provide implemention to all the abstrat methods of abstract class.

//non-abstract class(concrete class) without abstract keyword.

//Abstract classes may also have constructors which will get executed during the child object's instantiation.
abstract class Shape
{

    public abstract void area(); //this is abstract method
    public  void sayHi()
    {
        System.out.println("hi");
    }
}

class Circle extends Shape{
    @Override
    public void area() {
        double PI=3.14;
        int radious=5;
        System.out.println("area of cirlce: "+(PI*radious*radious));
    }
}

class Square extends Shape
{
    @Override
    public void area() {
        int sides=5;
        System.out.println("area of Square: "+(sides*sides));
    }
}

public class AbstractionTest {
    public void findArea(Shape shape)
    {
        shape.area();
        shape.sayHi();
    }
    public static void main(String[] args) {
        //Shape shape=new Circle();   upcasting..
        AbstractionTest abstractionTest=new AbstractionTest();
        abstractionTest.findArea(new Circle());
        abstractionTest.findArea(new Square());

//      Shape s=new Shape();   'Shape' is abstract; cannot be instantiated
    }
}
