package Loops;

import java.util.Random;
import java.util.Scanner;

public class Random6digitNestedLoop {
    public static void main(String[] args) {

        //Generate a random number that is six digits long. Each digit in this number should be unique, meaning the
        // number 6 digit number should have 6 different character numbers that make it up. Print the number.


        Random random= new Random();
        String number = "";



        for(int i=0; i<6; i++){
            int randomNumber= random.nextInt(10);
           // if(number.contains(random+"")){
            //    randomNumber= random.nextInt(10);
           // }
            while(number.contains(random+"")){
                System.out.println(random);
                randomNumber=random.nextInt(10);
            }


            number += randomNumber;



        }
        System.out.println(number);
















    }
}
