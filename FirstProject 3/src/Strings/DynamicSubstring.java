package Strings;

import java.util.Scanner;

public class DynamicSubstring {

    public static void main(String[] args) {
        //Given two strings of lowercase English letters, word1  and word2, perform the following operations:
        //
        //Sum the lengths of word1 and word2 and print
        //Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.
        //
        //Sample Input:
        //hello world
        //
        //Sample Output:
        //10
        //Hello World
        //
        //
        //Sample Input:
        //java cool
        //
        //Sample Output:
        //8
        //Java Cool

        Scanner input= new Scanner(System.in);
         //String word1 = input.nextLine();
        // String word2 = input.nextLine();
        System.out.println("Enter two words(separate with space):");

        String str3 = input.nextLine();

        int space = str3.indexOf(" ");
        String word1 = str3.substring(0,space);
        String word2 = str3.substring(space).trim();
        String fullWord = word1+word2;
        System.out.println(fullWord.length());

        word1 = word1.substring(0,1).toUpperCase()+word1.substring(1);
        word2 = word2.substring(0,1).toUpperCase()+word2.substring(1);

        System.out.println(word1+" "+word2);








    }
}
