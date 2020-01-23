package Strings;

import java.util.Scanner;

public class SeparateStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User will be given a string: “Sender: <James Bond>. From Number: [202-123-3456]. +Message:
        // {“I love programming and problem solving}”> You will separate these parts and print them separately. >
        // Print the following: “Sender:  actualSender”“Number: actualNumber”“Message: actualMessage”

        String sentence ="Sender: <James Bond>. From Number: [202-123-3456]. " +
                "+Message: {“I love programming and problem solving}";

        int from = sentence.indexOf("From");
        int message = sentence.indexOf("Message");
        String sender= sentence.substring(0,(from-1));
        String from2= sentence.substring(from,(message-1));
        String message2 = sentence.substring(message);
        System.out.println(sender);
        System.out.println(from2);
        System.out.println(message2);







    }
}
