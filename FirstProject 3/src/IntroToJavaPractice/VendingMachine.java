package IntroToJavaPractice;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);


    }

        }
    //Write a program what asks the user to enter two decimal numbers. Take these two numbers and perform all the
// mathematical operations (+,-, *, /, %) on them. Print all the results. > input 3.5, 6 > output: Addition: 9.5 etc
// for Subtraction, Multiplication, Division, Remainder