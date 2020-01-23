package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner5Names {
    public static void main(String[] args) {

        //Write a program that will ask user to enter 5 names. Take each name and store all the names into an array.
        // Print the array


        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want to enter? ");
        int size = input.nextInt();
        input.nextLine();

        String [] name = new String[5];

       for(int i=0; i<name.length; i++){
           System.out.println("enter name " + (i+1));
           name[i]= input.nextLine();

       }

        System.out.println(Arrays.toString(name));












    }
}
