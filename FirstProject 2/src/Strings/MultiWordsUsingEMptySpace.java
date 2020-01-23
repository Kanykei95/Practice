package Strings;

import java.util.Scanner;

public class MultiWordsUsingEMptySpace {
    public static void main(String[] args) {
        //Write a program that finds if the given String consists of multiple word.Declare boolean has MultipleWords.
        // Declare boolean has Multiple Words. Ask user to enter some string and check if the entered String has atleast
        //one empty space set true to hasMultipleWords, set false to hasMultipleWords if String is single word.


        Scanner input = new Scanner(System.in);
        String str;
        boolean multipleWords;
        System.out.println("Please enter the string");
        str = input.nextLine();


        if(str.contains(" ")){
            multipleWords=true;
        }else{
            multipleWords=false;
        }
        System.out.println("Multiple words: " + multipleWords);



    }
}
