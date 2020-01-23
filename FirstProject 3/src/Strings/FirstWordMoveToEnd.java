package Strings;

import java.util.Scanner;

public class FirstWordMoveToEnd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
        //> input: “Java is a fun language”
        //> output: “is a fun language Java”
        //hint: you know the first space will be the end of the first word

        System.out.println("Enter sentence");
        String sentence = input.nextLine();

        int space = sentence.indexOf(" ");
        String firstWord= sentence.substring(0,space);
        String remain = sentence.substring(space + 1);
        System.out.println(remain + " " + firstWord);












    }
}
