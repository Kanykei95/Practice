package Loops;

import java.util.Scanner;

public class AlphabetLetterDoWhileLoop {

    public static void main(String[] args) {


        Scanner input = new Scanner (System.in);




            System.out.println("enter letter");
            char letter= input.nextLine().toUpperCase().trim().charAt(0);

            if(letter>=65&&letter<=90){

                while(letter!=91){
                    System.out.println(letter++);
                }
            }else{
                System.out.println("Not a valid letter");
            }





























    }
}
