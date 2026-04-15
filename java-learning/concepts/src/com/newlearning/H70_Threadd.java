package com.newlearning;

class MyThread1 extends Thread {
    @Override
    public void run(){
        int i = 0;
        while (i<50000) {
            System.out.println("The Cooking Thread is Running");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run(){
        int i = 0;
        while (i<50000) {
            System.out.println("Thread2 for Chatting with her");
            System.out.println("I am Sad!");
            i++;
        }
    }
}

public class H70_Threadd {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        //This work both at same time so it take less time to execute and it called Thread
        t1.start();
        t2.start();

    }
}
