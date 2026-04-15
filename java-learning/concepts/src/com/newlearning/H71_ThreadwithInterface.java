package com.newlearning;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run(){
        while(true) {
            System.out.println("I am Thread 1 not Threat not 1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run(){
        while(true) {
            System.out.println("I am Thread 2 not Threat not 2");
        }
    }
}


public class H71_ThreadwithInterface {
    public static void main(String[] args) {

        MyThreadRunnable1 Bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(Bullet1);
        MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(Bullet2);

        gun1.start();
        gun2.start();



    }
}
