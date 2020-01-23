package Strings;

import java.util.Scanner;

public class Monthboolean {
    public static void main(String[] args) {

        //You have a value that hold what month it is (October). Ask the user to enter the month from the console.
        // If the user’s input matches the expected month put print true, but if the input does not match the actual
        // month print false. Uppercase and lowercase letters do not matter, we only care about the value.


        Scanner input = new Scanner (System.in);

        String month = "October";
        System.out.println("Enter Month");
        String userMonth = input.nextLine();

        boolean answer = userMonth.equalsIgnoreCase("october");
        System.out.println(answer);


        //String month1 = month.toLowerCase();
        //System.out.println(month1.equals("October"));
























    }



}
