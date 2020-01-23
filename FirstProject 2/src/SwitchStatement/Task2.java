package SwitchStatement;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
Random random = new Random();

        //Guess Number: User is asked to guess a number from 1 to 10
        //Write a program that generates a random number and takes a guess from the user.
        //> If user guesses correct number they should see “ Congrats you guessed right”
        //> If user guess is more than the random number they should see: “your guess is too high”
        //> If user guess is less than the random number they should see “your guess it too low”
        Scanner input = new Scanner(System.in);
        Random Random = new Random();
        System.out.println("Enter number here");

        int guess = input.nextInt();
        int randomNumber = random.nextInt(10);

        System.out.println(randomNumber);


        if(randomNumber == guess){
            System.out.println("Congrats you guessed it right");

        }else if (guess>randomNumber){
            System.out.println("Your guess is too high");
        }else if(guess<randomNumber){
            System.out.println("Your guess is too low");
        }








    }
}
