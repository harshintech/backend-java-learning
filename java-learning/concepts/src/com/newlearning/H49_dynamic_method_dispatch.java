package com.newlearning;

class Phone {
    public void showTime(){
        System.out.println("Time is 8'o clock");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Music Playing......");
    }

    @Override
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}


class X11{
    public void show(){
        System.out.println("in show x11");
    }
}

class Y11 extends X11{
    public void show(){
        System.out.println("in show y11");
    }
}

class Z11 extends X11{
    public void show(){
        System.out.println("in show z11");
    }
}


public class H49_dynamic_method_dispatch {
    public static void main(String[] args) {

        /*

        //Reference         //object
        Phone obj   =   new Phone();  //-->phone reference +  obj is object name + Phone() is object
        SmartPhone obj2 = new SmartPhone(); //--> It is Allowed
        obj.on();  //-->  It is Allowed

         */


        //-->Phone reference +  obj3 is object name + SmartPhone() is object
        Phone obj3 = new SmartPhone();//-->It is allowed bcoz SmartPhone called as Phone in real life.
       // SmartPhone obj4 = new Phone(); //-->It is not allowed bcoz Phone not called as SmartPhone in real life.

        obj3.on();
        obj3.showTime();
       //obj3.music(); //--> It is not Allowed






        

        //this is different part of code

        X11 x11 = new X11();
        x11.show();;

        x11 = new Y11();
        x11.show();

        x11 = new Z11();
        x11.show();
    }
}
