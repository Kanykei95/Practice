package IfElseStatements;

import java.util.Scanner;

public class BuildCalculator {
    public static void main(String[] args) {

        //  Write a program that asks two double values and allows user to choose arithmetic operation to apply.
        //  Then program should calculate based on the chosen arithmetic operator by user.
        //Note: Use switch statement
        //Flow: Please enter two double values: > 23.5 > 11.3 Please choose operator from below options:
        // +, -, *, / >- Result of 23.5 - 11.3 is 12.2

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two double values:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Choose operators from *,-,+,/");
        String operator = input.nextLine();

       if (operator.equals("*")){
           System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 * num2));
       }
         else if (operator.equals("-")){
           System.out.println("Result of" + num1 + operator + num2 + " is " + (num1-num2));
       }

       else if (operator.equals("+")){
           System.out.println("Result of" + num1 + operator + num2 + " is " + (num1+num2));
       }
       else if (operator.equals("/")){
           System.out.println("Result of" + num1 + operator + num2 + " is " + (num1/num2));
       }

       else {
           System.out.println("Invalid operator. Please try again!");
       }













    }
}
