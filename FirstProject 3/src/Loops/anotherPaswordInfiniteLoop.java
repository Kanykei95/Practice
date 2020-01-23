package Loops;

import java.util.Scanner;

public class anotherPaswordInfiniteLoop {
    public static void main(String[] args) {

        //Modify the above task:
        //Give 3 attempts to login.
        //If user fails to enter right password within 3 attempts print "Sorry. You account is locked. Try after
        // 5 hours" and end the program.

        Scanner input = new Scanner(System.in);




        String password = "secret478";


        for (int attempts =0; ; attempts++){


            if(attempts == 3) {
                System.out.println("your account is locked");
                break;

            }
            System.out.println("Enter the password");
            String userPass = input.nextLine();
            if (password.equals(userPass)){
                System.out.println("Welcome to your profile");
                break;
            }


        }

    }

















}



