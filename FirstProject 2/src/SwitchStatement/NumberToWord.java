package SwitchStatement;

import java.util.Random;
import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Write a program that will ask the user to enter a number from 1 to 9. They should see the number they entered
        // in word format. If the number is not in the range print: “Invalid number”
        //> input: 5
        //> output: five
        System.out.println("Enter number from 1-9");
        int number = input.nextInt();
        String word = "";
        switch (number){

            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;

            default:
                word = "Not a valid Number";
        }

        System.out.println(word);





    }
}
