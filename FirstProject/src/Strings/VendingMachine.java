package Strings;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        //Write a program that determines the change to be dispensed from a vending
        //machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
        //increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
        //dollar bill to pay for the item.
        //
        //See the example output as shown below:
        //Input:
        //Enter price in cents: 95↵
        //Output:
        //Your change is 0 quarters, 0 dimes, and 1 nickels.

        Scanner input = new Scanner(System.in);

        int price = 0;
        int quarter = 0;//25
        int dime = 0;
        int nickel = 0;

        System.out.println("enter price in cents");
        price= input.nextInt();

        int change = 100 - price;
        quarter = change/25;
        int remAfterQuarter= change%25;
        dime = remAfterQuarter/10;
        int remAfterDime = remAfterQuarter%10;
        nickel = remAfterDime/5;

        System.out.println("quarter "+quarter+"Dime "+ dime+"Nickel "+nickel);









    }
}
