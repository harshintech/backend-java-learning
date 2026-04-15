package com.newlearning;

import java.sql.SQLOutput;

class C1{
    public int x = 56;
    protected int y = 23;
    int z = 12;
    private int a = 89;

    public void math1(){
        System.out.println("The value is: " + x);
        System.out.println("The value is: " + y);
        System.out.println("The value is: " + z);
        System.out.println("The value is: " + a);
    }
}

public class H66_access_modifier {
    public static void main(String[] args) {
        C1 c = new C1();
        c.math1();

        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a); <-- This is private we not use in same package only use in same class
    }
}
