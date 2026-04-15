package com.newlearning;

class Base1{

    int x;

   Base1(){
        System.out.println("Main Constructors Hoon......");
    }

    Base1(int a){
        System.out.println("I am overloaded constructors " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    int y;

    Derived1(){
//        super(8);  //---> this function call constructors with parameter of base1(parent or superclass)
        System.out.println("Main Y ka Constructors Hoon.......");
    }

    Derived1(int b,int e){
        super(b);
        System.out.println("Main Y ka parameter wala Constructors Hoon......." + e);

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildOfDerived extends  Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class H46_constructors_in_inheritance {
    public static void main(String[] args) {

//        Base1 base = new Base1();
//       Derived1 derived = new Derived1();
//        Derived1 derived = new Derived1(5,6);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(555,666,777);


    }
}
