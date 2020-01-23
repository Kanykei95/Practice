package IfElseStatements;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        // Write a program that finds if the entered number is odd or even.
        //Simply ask user to enter one integer value and print "odd or "even" based on the value user enters.


        Scanner input = new Scanner(System.in);
        System.out.println("Enter  integer");
        int num = input.nextInt();

        if (num % 2==0){
            System.out.println("Even");
        }


        else{
            System.out.println("odd");
        }

















    }
}
