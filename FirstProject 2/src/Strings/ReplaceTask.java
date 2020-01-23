package Strings;


import java.util.Scanner;

public class ReplaceTask {
    public static void main(String[] args) {
        //You have a String with the following value:
        //    -> “We will have a picnic when the weather gets nicer”
        //First print the given sentence. Then the user is asked to enter the following: the set of characters from
        // the sentence they want to change, and the set of characters that will show up in place of the ones which
        // were removed. Print the new sentence.
        //> input: “w” , “La”
        //> output: “We Laill have a picnic Lahen the Laeather gets nicer”

        Scanner input = new Scanner (System.in);

        String given = "We will have a picnic when the weather gets nicer";
        System.out.println(given);
        String word1= input.nextLine();
        String word2= input.nextLine();

        String replacement = given.replace(word1,word2);
        System.out.println(replacement);



    }
}
