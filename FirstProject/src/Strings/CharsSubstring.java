package Strings;

import java.util.Scanner;

public class CharsSubstring {
    public static void main(String[] args) {
        //ask user about entering his name
        //take two last letter
        // print them three times

        Scanner input = new Scanner(System.in);

        String enteredByUser = input.nextLine();
        int length1= enteredByUser.length();

        char firstFromTheEnd = enteredByUser.charAt(length1-1);
        char secongFromTheEnd= enteredByUser.charAt(length1-2);

        char firstLetterFromBegining = enteredByUser.charAt(0);
        char secondLetterFromBegiing = enteredByUser.charAt(1);

        System.out.println("first from end letter is " + firstFromTheEnd);
        System.out.println("second from the end letter is "+ secongFromTheEnd);
        System.out.println("first letter " + firstLetterFromBegining);
        System.out.println("second letter is "+ secondLetterFromBegiing);










    }
}
