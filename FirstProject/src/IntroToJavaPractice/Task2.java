package IntroToJavaPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Write a program that will ask user to enter two whole numbers.
        // Increment the first number by the second number 3 times.
        // Print the information in this format:
        //Your number is: firstNumber after being incremented by secondNum counter times


        int one = input.nextInt();
        int two = input.nextInt();

        int count = 0;

        one += two;//5+=10__>15
        count++;

        System.out.println("Your number: " + one + "after being incremented by " + two + " " + count + "times");
        one += two;
        count++;
        System.out.println("Your number: " + one + "after being incremented by " + two + " " + count + "times");
        one += two;
        count++;
        System.out.println("Your number: " + one + "after being incremented by " + two + " " + count + "times");
        one += two;
        count++;





















    }
}
