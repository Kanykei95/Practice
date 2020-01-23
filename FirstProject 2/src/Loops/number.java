package Loops;

import java.util.Scanner;
//Write a program that asks the user to enter a number more than 0. Print the all the numbers from
// 0 to the entered number.

public class number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number more than 0");
        int enteredNum= input.nextInt();
        int start = 0;

        while(start<=enteredNum){
            System.out.println(start++);

        }

    }
}
