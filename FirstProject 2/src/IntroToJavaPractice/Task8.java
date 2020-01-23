package IntroToJavaPractice;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whole number from 1 to 99");
        int amount = input.nextInt();
        int quarter = amount/25;
        amount = amount%25;
        int dimes = amount/10;
        amount = amount%10;
        int nickel= amount/5;
        amount = amount%5;
        int cents= amount;
        System.out.println(quarter);
        System.out.println(dimes);
        System.out.println(nickel);
        System.out.println(cents);












    }
}
    //Vending machine change. Write a program that will ask used to enter a whole number from 1 to 99. User will get
// back the amount of quarters, dimes, nickels, and pennies that are needed to equal to the provided number. > input
// Enter your change68 > outputYour change of 68 was converted to:quarters: 2dimes: 1nickels: 1pennies: 3