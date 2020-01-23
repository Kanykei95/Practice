package Methods;

import Arrays.Check;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
       // Create a method that accepts String and int.
        //Check if string length is same as given integer.
        // Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.
        Scanner input = new Scanner (System.in);
        length("names",4);




    }
    public static void length (String str, int length){
        if(str.length()==length){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }


    }
}
