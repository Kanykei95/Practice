package Strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user ="test";
        String pass ="test123";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = input.nextLine();
        if(username.equals(user)){
            System.out.println("Enter your password:");
            String password =input.nextLine();
            if(password.equals(pass)){
                System.out.println("Welcome!");
            }else{
                System.out.println("Invalid password");
            }
        }else {
            System.out.println("Invalid username");
        }


    }
}


