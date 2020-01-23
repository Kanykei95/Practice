package Strings;

import java.util.Scanner;

public class AccountNumberEx2Nested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String account = input.nextLine();

        if (account.charAt(0) == '2') {
            if (account.length() >= 7) {
                System.out.println("valid 2 acct");
            } else {
                System.out.println("invalid 2 acct");
            }

        } else if (account.charAt(0) == '5') ;
        {
            if (account.length() == 10) {
                System.out.println("valid 5 account");
            } else {
                System.out.println("invalid 5 account");
            }

            //  }else
            //  System.out.println("Invalid account number");


        }
    }}
