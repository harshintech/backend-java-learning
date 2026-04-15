package com.learning;

import java.sql.SQLOutput;

public class H14_StringMethod {
    public static void main(String[] args) {

        String name = "Harsh";  //index start from 0
        //String name1 = new String("Harry");
        System.out.println(name);


        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Harsh     ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(2));

        System.out.println(name.substring(1,4));  //1 is include but 4 is not include here
        System.out.println(name.substring(1,5));  //1 is include but 5 is not include here

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("r","iee"));

        System.out.println(name.startsWith("Ha"));

        System.out.println(name.endsWith("sh"));

        System.out.println(name.charAt(2)); //what is letter on index 2

        System.out.println(name.indexOf("rs")); //here give first letter index

        String name1 = "Harshharsh";

        System.out.println(name1.indexOf("rsh",4));  //start search from index 4

        System.out.println(name1.lastIndexOf("rsh")); //this is start search from last

        System.out.println(name1.lastIndexOf("rsh",4)); // this is search in index 0 to 4 and start search from last

        System.out.println(name.equals("Harsh"));

        System.out.println(name.equalsIgnoreCase("haRsh"));



        //Escape Sequence  --> \n   \t   \"   \'   \\   etc.
        System.out.println("I am escape sequence \\ double quote");

        System.out.println("I am escape \" sequence \' double quote");

    }

}
