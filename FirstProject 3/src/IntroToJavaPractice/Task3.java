package IntroToJavaPractice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that will ask user to enter two numbers.
        // Declare a boolean with the following value: numberOne > numberTwo. Print the resulting boolean.
        Scanner input = new Scanner(System.in);

        int one = input.nextInt();
        int two = input.nextInt();
        boolean result = one>two;
        System.out.println(result);



















    }
}
