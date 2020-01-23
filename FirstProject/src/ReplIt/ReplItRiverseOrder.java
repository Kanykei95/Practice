package ReplIt;

import java.util.Scanner;

public class ReplItRiverseOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below

        String[] s = sentence.split(" ");

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);

        }
    }
}
