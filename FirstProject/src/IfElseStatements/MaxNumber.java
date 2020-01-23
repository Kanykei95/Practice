package IfElseStatements;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("three integer");

        //write a program that asks 3 integers from user and finds maximum value among those 3 entered integers.
        // print "all 3 integers are equal" if they are all equal to each other
        //Note use if else statement
        // note: consider logical operators



        int num1= input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Max number is: "+ num1);
        }

        else if (num2>num1 && num2 >num3){
            System.out.println("Max number is: "+ num2);
        }
        else if (num3>num1 && num3>num2){
            System.out.println("Max number is:" + num3);
        }




        else if ( num1 == num2 && num1 == num3){
            System.out.println("All number are equal");
        }












    }
}
