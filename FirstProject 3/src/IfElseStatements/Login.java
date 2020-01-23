package IfElseStatements;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //Create 2 String variable for your username and password

        //Write a program that asks from the user to enter the username.
        //If username matches then ask for password. if password matches too. then print "Login Successfull!"
        // if username is true but password is not true, print, "wrong password"
        //if username doesnt match, print "invalid username."

        Scanner input = new Scanner(System.in);
        String username = "KanaApsalbekova";
        String password = "1995Kana";

        System.out.println("please enter username:");
        String enterUsername = input.nextLine();


        if (enterUsername.equals(username)) {

        System.out.println("please enter your password:");
       String enterPass = input.nextLine();
        if (enterPass.equals(password)) {
                System.out.println("Login successful");
            }

            else {
            System.out.println("Wrong password");
        }
        }
    

             else{
            System.out.println("Invalid username. Try again");
            }





















    }
}
