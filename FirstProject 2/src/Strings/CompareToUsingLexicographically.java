package Strings;

import java.util.Scanner;

public class CompareToUsingLexicographically {

    //User takes two strings from the user. Compare the Strings and print out the String that comes first
    // lexicographically.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Print 2 Strings");

        String str1 = input.nextLine();
        String str2 = input.nextLine();

        int compare = str1.compareTo(str2);

        if (compare<0){
            System.out.println(str1);
        }else if (compare>0){
            System.out.println(str2);
        }else{
            System.out.println("equal");
        }












    }
}
