package Strings;

import java.util.Scanner;

public class kkkk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String str = input.next();

        // your code
        // ------------------------------------------
        str.toLowerCase();

        if(str.length()>1){
            System.out.println("Error.It should be exactly 1 character length!");
        }else if(str.equals("a")||str.equals("A")||str.equals("e")||str.equals("E")||str.equals("i")||str.equals("I")
                ||str.equals("o")||str.equals("O")||str.equals("u")||str.equals("U")){
            System.out.println("Input letter is Vowel");
        }else {
            System.out.println("Input letter is Consonant");
        }



    }
}


