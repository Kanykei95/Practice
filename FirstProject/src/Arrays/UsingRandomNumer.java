package Arrays;

import Loops.number;

import java.util.Arrays;
import java.util.Random;

public class UsingRandomNumer {
    public static void main(String[] args) {
        Random random= new Random();
        //Create an array with 50 random numbers in the range of 1-100. Then print the array

       int [] number = new int[50];
        for(int i = 1; i<50; i++){
            number[i]= random.nextInt(100)+1;

        }

        System.out.println(Arrays.toString(number));














    }
}
