package Loops;

import java.util.Scanner;

public class WordCharacterUnique {
    public static void main(String[] args) {
       // Write a program that asks the user to enter a word. Print out how many times a character is in the given word.
//> input: apple
               // > output:
        //apple has 1 a
        //apple has 2 p
        //apple has 1 l
        // apple has 1 e

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String checked = "";
        for(int i=0; i < word.length(); i++) {
            int count = 0;//declare by default.
            
            if(!checked.contains(word.charAt(i) + "")) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                checked += word.charAt(i) + " ";
                System.out.println(word + " has " + count + " "  + word.charAt(i));
            }
        }


    }
}
