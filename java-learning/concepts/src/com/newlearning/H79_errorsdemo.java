package com.newlearning;
import java.util.Scanner;

public class H79_errorsdemo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 and 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        //When you give input 0 so system throw you error it called Exception.
        //Because 1000/0 is not possible.
        //any value which is not 0 for true this.
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
