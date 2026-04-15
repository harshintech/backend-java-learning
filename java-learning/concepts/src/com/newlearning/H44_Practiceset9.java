package com.newlearning;

class Cylinder {
    int radius;
    int height;

    public Cylinder(int r1,int h1){
        this.radius = r1;
        this.height = h1;
    }

    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }

    public int getRadius(){
        return radius;
    }

    public int getHeight(){
        return height;
    }

    public float calculateArea(){
        return 2*3.14f*radius*(radius + height);
    }

    public float calculateVolume(){
        return 3.14f*(radius*radius)*height;
    }
}

class Ractangle {
    int length;
    int breath;

    public Ractangle(){
        this.length = 4;
        this.breath = 5;
    }

    public Ractangle(int l,int b){
        this.length = l;
        this.breath = b;
    }
}

public class H44_Practiceset9 {
    public static void main(String[] args) {

        /*

        //Problem 1

        Cylinder obj = new Cylinder();

        obj.setHeight(9);
        obj.setRadius(3);

        //Problem 2

        System.out.println(obj.calculateArea());
        System.out.println(obj.calculateVolume());

         */

        //Problem 3

        Cylinder obj = new Cylinder(3,9);

        System.out.println(obj.calculateArea());
        System.out.println(obj.calculateVolume());

        //Problem 4

//        Ractangle r = new Ractangle();
        Ractangle r = new Ractangle(4,5);

        System.out.println(r.length);
        System.out.println(r.breath);

        //Problem 5

        //---> Repeat 1 for a sphere



    }
}
