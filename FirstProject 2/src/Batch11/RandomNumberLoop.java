package Batch11;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberLoop {
    //Write a program that gereates the random integer between
    //0-100. keep asking from the user to guess the number until
    //user gets it right. print a message "your guess is too high" if user guess is higher than random number,
    // print "your guess is too low" if user guess is lower than random number. once user hits
    //the right numer print "congratulation!" and break the loop.
    //flow:generated number is 46
    //please guess the number:
    //50
    //your guess is too high!
    //please guess the number:
    //25
    //your guess is too low !
    //please guess the number:
    //35
    //your guess is too low!
    //46


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(101);
        System.out.println(target);
        int userInput;

        while(true){
            System.out.println("Please enter your input");
            userInput=input.nextInt();
            if(userInput<target){
                System.out.println("Your input is too low");
            }else if(userInput>target){
                System.out.println("Your input is too high");
            }else{
                System.out.println("CONGRATULATIONS");
                break;
            }
        }





//
//        do {
//            System.out.println("Please enter your input");
//            userInput = input.nextInt();
//            if (userInput < target) {
//                System.out.println("Your input is too low");
//            } else if (userInput > target) {
//                System.out.println("Your input is too high");
//            } else {
//                System.out.println("CONGRATILATIONS");
//            }
//
//        }while (target != userInput) ;
//



    }
}
