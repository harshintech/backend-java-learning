package com.newlearning;

import java.sql.SQLOutput;

public class H80_tryandcatch {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        //without Try
        //int c = a/b;
        //with Try
        try{
            int c = a/b;
            System.out.println("The Result is : "+ c);
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }

        System.out.println("End of the programme");
    }
}
