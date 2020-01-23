package Strings;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // You have a String with the following value:
        //    -> “Cybertek is located in Des Plaines”
        //The user is asked to enter a part of the string they are looking for. Find the position of the String the
        // user is looking for and print it.
        //Ex:
        //> Input: “located”
        //> Output: 12

        String sentence = "Cybertek is located in Des Plaines";

        System.out.println("enter word");

        String word = scanner.nextLine();

        int index = sentence.indexOf(word);
        System.out.println(index);














    }

}
