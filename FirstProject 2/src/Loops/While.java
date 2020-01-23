package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add 1?");
        String enterUser = input.next();
        int count=0;

        while ( enterUser.equals("y") || enterUser.equals("yes")){
                count++;

            System.out.println("would you like to add 1?");
            enterUser=input.nextLine();


        }

        System.out.println("your number is: " + count);

    }
}
