package Loops;

import java.util.Scanner;

public class PaswordInfiniteLoop {
    public static void main(String[] args) {

        //Write a program for the login to application.
        //Program should ask for the password until user hits right password.
        //password is "secret478". If user enters right password print "Welcome to your profile!" and exits the infinite loop.
        //Flow:
        //Please enter your password:
        //> james
        //Please enter your password:
        //> adam
        //Please enter your password:
        //> secret478
        //Welcome to your profile!

        Scanner input = new Scanner(System.in);




        String password = "secret478";


        for (; ;){
            System.out.println("Enter the password");
            String userPass = input.nextLine();

            if(userPass.equals(password)) {
                System.out.println("Welcome to your profile");
                break;

            }


            }

        }

















    }

