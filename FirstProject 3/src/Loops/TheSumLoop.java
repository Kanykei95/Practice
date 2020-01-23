package Loops;

import java.util.Scanner;

public class TheSumLoop {
    public static void main(String[] args) {

        //Write a program that will ask the user to enter two numbers. The first number will be the starting value
        // for your range. The second number will be the ending number of your range. Add up the sum of all the
        // numbers in your range and print
        //“The some of num1 to num2 is: sumAllValue”
        //> input: 1, 100
        // > output: “The some of 1 to 100 is: 5050”

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1= input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;

        double avg = num2 - num1;

        for(int i = num1; i<=num2; i++){
            sum += i;

        }
        System.out.println("The sum of " +num1+" to " +num2+ " is " + sum);
        System.out.println("Average " + (sum/avg));











    }
}
