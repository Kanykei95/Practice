package Strings;

import java.util.Scanner;

public class OlgaSlackTask2 {
    public static void main(String[] args) {
        //Ask from user his first name, last name, age.
        //Print out the result («Your name is »+ first name + «Your last name is »  + last name + «Your age» + age.
        //(hint - use scanner. Create two strings variables, one int variable)

        Scanner input = new Scanner(System.in);

        String name= input.nextLine();
        String last = input.nextLine();
        int age = input.nextInt();

        System.out.println("Your name is " +name+ " Your last name is " + last+ " Your age is "+ age);














    }
}
