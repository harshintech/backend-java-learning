package com.learning;

public class H31_methods {


    //when you use static keyword so you don't need to create object for method in main method
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }

    public static void main(String[] args) {

                int a = 5;
                int b = 7;
                int c;
                // Method invocation using Object creation
                //H31_methods obj = new H31_methods();
                //c = obj.logic(a, b);


                c = logic(a, b); //when you use static keyword so you don't need to create object for method
                System.out.println(a + " "+ b);
                int a1 = 2;
                int b1 = 1;
                int c1;
                c1 = logic(a1, b1);
                System.out.println(c);
                System.out.println(c1);


    }
}
