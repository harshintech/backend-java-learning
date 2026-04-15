package com.learning;
import java.util.Scanner;

public class H6_Exercise1 {
    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);

        System.out.println("Enter Higher secondary school mark");

        System.out.println("maths");
        float a = ac.nextInt();

        System.out.println("english");
        float b = ac.nextInt();

        System.out.println("chemistry");
        float c = ac.nextInt();

        System.out.println("physics");
        float d = ac.nextInt();

        System.out.println("computer");
        float e = ac.nextInt();

        float sum = a+b+c+d+e;

        System.out.println(sum);

        float total = 100*5;

        System.out.println(total);

        float percentages = ((sum/total)*100);
        System.out.println(percentages);






    }
}
