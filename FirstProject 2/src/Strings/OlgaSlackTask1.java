package Strings;

import java.util.Scanner;

public class OlgaSlackTask1 {
    public static void main(String[] args) {
        //Ask from user two integers. Calculate the sum (+), subtraction(minus), devision (/) and multiplying (*)
        // them. (hint: you need to create two integers and scanner. Than you need to create four other integers for
        // math calculations). Print out the result of your calculations.
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 integers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1+num2;
        int subtraction = num1-num2;
        int division = num1/num2;
        int multi = num1*num2;
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(division);
        System.out.println(multi);






















    }
}
