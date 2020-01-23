package Strings;

import java.util.Scanner;

public class GroupTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Given two strings of lowercase English letters, word1  and word2, perform the following operations:

       // Sum the lengths of word1 and word2 and print
       // Capitalize the first letter in word1 and word2 and print them on a single line, separated by a space.


      String word= input.nextLine();

     int index = word.indexOf(" ");

     String word1 = word.substring(0,index);
     String word2 = word.substring(index+1);

     int sum = word1.length()+word2.length();

        System.out.println( word1.substring(0,1).toUpperCase() + word2.substring(1)+" " +word2.substring(0,1).toUpperCase()
        +word2.substring(1));

//(str3_1.substring(0,1).toUpperCase() + str3_1.substring(1) +" "+ str3_2.substring(0,1).toUpperCase() + str3_2.substring(1));










    }
}
