package Arrays;

import Loops.number;

import java.util.Arrays;

public class ChangingNegativeNumbersToZero {
    public static void main(String[] args) {

        //0.5) Given numbers of 4,-2,5,-3,-20,30. Write a program that will change any negative number to be 0.
        // Print the changed array.
       //-------------------------------------------------------------------------

        int [] num = new int[6];
        num [0] = 4;
        num [1] = -2;
        num [2] = 5;
        num [3] = -3;
        num [4] = -20;
        num [5] = 30;

        for(int i =0; i<num.length; i++){
            if (num[i] <0){
                num[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num));


    }
}
