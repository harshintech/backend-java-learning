package com.usefullexercise;
import java.util.Random;
import java.util.Scanner;

class Game{
    int guessnum;
    int userinput;
    int noOfGuesses=0;

    public Game(){
        Random obj = new Random();
        guessnum = obj.nextInt(101);
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("guess the number between 1 to 100");
        userinput = sc.nextInt();
    }

    public void isCorrectNumber(){
        if(userinput > guessnum){
            System.out.println("Too High");
        }
        else if(userinput < guessnum){
            System.out.println("Too Low!");
        }
        else if(userinput == guessnum){
            System.out.println("Correct Number!");
        }
        else{
            System.out.println("try again");
        }
    }

    public void setNoOfGuesses(){
        noOfGuesses++;
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
}

public class H43_Exercise3 {
    public static void main(String[] args) {

//        Java Exercise 3: Guess the Number (OOPs Edition)

//        Create a class Game, which allows a user to play "Guess the Number" game once.
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!


         Game game = new Game();
         Scanner sc = new Scanner(System.in);

         do{
             game.takeUserInput();
             game.isCorrectNumber();
             game.setNoOfGuesses();

         }while(game.userinput != game.guessnum);


        System.out.println("No of Guesses :"+ game.getNoOfGuesses());


//        System.out.println(game.RandomNum);

    }
}
