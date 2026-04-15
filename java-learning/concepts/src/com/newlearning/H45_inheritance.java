package com.newlearning;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am Printer");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class H45_inheritance {
    public static void main(String[] args) {

//-->          Creating an Object of base class
//        Base b = new Base();
//        b.setX(7);
//        System.out.println(b.getX());
//        we not use Y here bcoz base have no access for y but derived access both x and y

//-->        Creating an object of derived class
        Derived d = new Derived();
        d.setX(7);
        System.out.println(d.getX());

        d.setY((77));
        System.out.println(d.getY());

    }
}
