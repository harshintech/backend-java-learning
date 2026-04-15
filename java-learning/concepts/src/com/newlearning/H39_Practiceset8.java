package com.newlearning;

// Here you create Employee1 class because You already create Employee class in H38

class Employee1 {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

//-------------------------------------------------------------------------------------->

class Cellphone {

    public void ring(){
        System.out.println("Ringing....");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void callFriend(){
        System.out.println("Calling Friend...");
    }
}

//-------------------------------------------------------------------------------------->

class Square {
    int side;

    public int area(){
        return side*side;
    }

    public int parameter(){
        return 4*side;
    }
}

//-------------------------------------------------------------------------------------->

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

//-------------------------------------------------------------------------------------->

public class H39_Practiceset8 {
    public static void main(String[] args) {

        /*

        //Problem 1

        Employee1 Harsh = new Employee1();
        Harsh.setName("CodewithHarsh");
        Harsh.salary = 385;
        System.out.println(Harsh.getSalary());
        System.out.println(Harsh.getName());

        //Problem 2

        Cellphone oneplus = new Cellphone();
        oneplus.callFriend();
        oneplus.ring();
        oneplus.vibrate();



        //Problem 3

        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.parameter());

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

         */


    }
}
