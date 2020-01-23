package Loops;

import java.util.Scanner;

public class NamePrinted15Times {
    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);
        System.out.println("Enter name");
        String name = input.nextLine();

        for (int i= 0; i < 15; i++){
            System.out.println(name + i);
        }


        System.out.println();



        for (int i=0; 1 < name.length(); i++) {
            System.out.println(name.charAt(i) + " for index" + i);
        }









    }
}
