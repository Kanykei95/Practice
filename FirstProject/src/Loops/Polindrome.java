package Loops;

import java.util.Scanner;

public class Polindrome {
    //Accept a string and if it is palindrome, print "Palindrome", if not print "Not Palindrome"
    //(It should be case-insensitive).
    //
    //Example 1
    //Input:
    //civic
    //Output:
    //Palindrome
    //Example 2
    //Input:
    //java
    //Output:
    //Not Palindrome
    //Example 3
    //Input:
    //Mom
    //Output:
    //Palindrome

        public static void main(String[] args) {
            Scanner input =  new Scanner (System.in);
            String word = input.nextLine();

            String back = "";

            for(int i = word.length()-1; i>=0; i--){
                back+= word.charAt(i);
            }
            System.out.println(word);
            System.out.println(back);

            if (word.equals(back)){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not Palindrome");
            }

        }
    }

