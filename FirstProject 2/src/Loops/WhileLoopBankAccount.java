package Loops;

import java.util.Scanner;

public class WhileLoopBankAccount {
    //You have a bank account balance of 1500. You can continue to spend as long as you have money in your account.
    // Write a program that will ask the user to enter the cost of an item. If your balance has enough money for that
    // item complete the purchase and take the money out of the account. If there is not enough money in your account
    // for that item print “Card Declined get a different item”. Allow continuous purchasing until the account becomes
    // 0. When your account has a balance of 0 print “You are broke”

    //Flow: (balance of 600) Please enter transaction amount:
    //  > 200
    //Item Purchased  Please enter transaction amount: 
    // >300
    //Item Purchased Please enter transaction amount: 
    // > 100

    //Item Purchased Please enter transaction amount: 5 You are broke.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int balance= 1500;
        int transBal;
        int dec= 0;

        while(balance>0){

            System.out.println("Enter the transaction amount");
            transBal = input.nextInt();

            if(transBal<=balance){
                System.out.println("item purchased");
                balance-=transBal;//balance=balance-tansBal
                dec=0;
            }else{
                System.out.println("card declined");
                dec++;
            }
            if (dec == 3) {
                System.out.println("card is locked");
                break;
            }







        }
        if (balance==0){
            System.out.println("your broke");
        }



    }

}



