package com.newlearning;

interface Bicycle {
    int a = 99;
    void applyBreak(int decrement);
    void speedUp(int increment);


}
//--> when you implement this bicycle class in other class
// so you must need to add this two method in other class else give you error

interface HornBicycle{
    void horn1();
    void horn2();
}

class AvonCycle implements Bicycle,HornBicycle{

    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }

    public void horn1(){
        System.out.println("HORN 1...");
    }

    public void horn2(){
        System.out.println("HORN 2...");
    }
}



public class H54_interface {
    public static void main(String[] args) {

        AvonCycle cycleHarsh = new AvonCycle();
        cycleHarsh.applyBreak(1);
        //You can create properties in interface
        System.out.println(cycleHarsh.a);
        //you can not modify properties in interface as they are final
//        cycleHarsh.a = 66;
        System.out.println(cycleHarsh.a);



        cycleHarsh.horn1();
        cycleHarsh.horn2();
//        cycleHarsh.nothing();
    }
}
