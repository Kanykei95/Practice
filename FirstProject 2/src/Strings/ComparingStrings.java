package Strings;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        //Given a String , n , perform the following conditional actions:
        //If  n contains vowel characters (a, e, i, o, u) print Vowel, if not print Not Vowel
        //
        //Input:
        //
        //apple
        //
        //Output:
        //
        //Vowel
        //
        //
        //Input:
        //
        //dfg
        //
        //Output:
        //
        //Not Vowel


        Scanner input= new Scanner(System.in);

        String enterByUser = input.nextLine();
        enterByUser= enterByUser.toLowerCase();

        if(enterByUser.contains("a")|| enterByUser.contains("e")||enterByUser.contains("i")
                ||enterByUser.contains("o")||enterByUser.contains("u")){
            System.out.println("vowel");

        }else{
            System.out.println("not vowel");
        }


        if (enterByUser.equals("a")){
            System.out.println("string are equal");

        }else{
            System.out.println("strings are different");
        }






    }
}
