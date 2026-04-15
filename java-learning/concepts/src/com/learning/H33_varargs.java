package com.learning;

public class H33_varargs {

//    static int sum(int a,int b){
//        return a+b;
//    }
//
//    static int sum(int a,int b, int c){
//        return a+b+c;
//    }


    //when you add int x here in parameter so you must need add one value here
    public static int sum(int x,int...arr){
        //Available as int[] arr
        //this method store value in arr
        int result = x;
        for(int a:arr){
            result +=a;
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs Tutorial");

//        System.out.println("The sum of " + sum() ); This allow when you remove int x from method
        System.out.println("The sum of " + sum(1,2) );
        System.out.println("The sum of " + sum(1,2,3) );
        System.out.println("The sum of " + sum(1,2,3,4,5) );
        System.out.println("The sum of " + sum(1,2,4,5,6) );
        System.out.println("The sum of " + sum(1,2,334,35,22,34,53) );


    }
}
