package Batch11;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UniqueCharacter {
    //write a program that finds the unique characters only from the given string. program should ask for a string
    // from the user through console and print only unique characters as a result.. program should ignore cases and
    // the white space if multiple words entered from user.

    //Flow:
   // Please enter the String. --> Hello World!
    //Result: helowrd
    //Notes: charAt, contains, length,toLowerCase,replace, forLoop

    //Pseudo code:
    //1.Read the String and store into String variable
    //2. convert all strings to lower case so it ignores the cases
    //3. replace white spaces with empty string
    //4.run for loop for each characters of the String
    //5.keep adding the characters to result also keep checking if result already contains characters
    // 6. print the result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your data");

        String data = input.nextLine();
        data = data.toLowerCase();
        data = data.replace(" ","");
        String result = "";

        for ( int i =0; i<data.length(); i++){
            char c = data.charAt(i);
            if(result.contains(c+"")){// converting character to a string thats why c+"";
                continue;
            }
            result +=c;

        }
        System.out.println(result);







    }













}
