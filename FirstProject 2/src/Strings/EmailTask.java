package Strings;

import java.util.Scanner;

public class EmailTask {
    public static void main(String[] args) {
        //Creating an email. Ask user to enter two strings. Both of these strings should be at least 6 character long.
        // If they are shorter than that print “Invalid data” and program should end.
        // If the information provided is
        // valid, you will take the first 4 characters of first string and combine them with the last three characters
        // of the second string. At the end of your combined string add “@cybertek.com” and print the final string as
        // your created email. > input: “JamesBond”,  Secret> output: jameret@cybertek.com

        Scanner input = new Scanner(System.in);
        System.out.println("Print two Strings");
        String word = input.nextLine();
        String word2 = input.nextLine();
        int length1 = word.length();
        int length2 = word2.length();
        String gmail = "@cybertek.com";
        String result1 = word.substring(0,3);
        String lastindex = word2.substring(length2-4);



        if (length1<6 && length2<6){
            System.out.println("Invalid data");
        }else{
            System.out.println(result1+lastindex+gmail);
        }





















    }
}
