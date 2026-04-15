package com.newlearning;

class A{
    public int a;
    public int harsh(){
        return 8;
    }

    public void method2(){
//        System.out.println("DJlsdjlsjflj");
        System.out.println("I am Method 2 of Class A.");
    }
}

class B extends A{
     //-->(@override same as comment) It is Good practice to add Override tag here and also
    //when you change parent class method name so this tag give you alert
    //and you easily check this fun is override or not.

    @Override
    public void method2(){
//        System.out.println("Bhavyraj");
        System.out.println("I am Method 2 of Class B");
    }

    public void method3(){
        System.out.println("I am Method 3 of Class B");
    }
}

public class H48_method_overriding {
    public static void main(String[] args) {

        A a = new A();
        a.method2();

        B b = new B();
        b.method2();

    }
}
