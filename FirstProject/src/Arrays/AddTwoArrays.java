package Arrays;

import java.util.Arrays;

public class AddTwoArrays {
    public static void main(String[] args) {

        //Given you have two arrays with values of:
        //    3,2,6,43,7,20      and
        //    2,7,-10,10,-5,2
        //    Write a program that adds each element and stores them into a new array. Print the final array

        int [] arrayOne = {3,2,6,43,7,20};
        int [] arrayTwon = {2,7,-10,10,-5,2};

        int[] sum = new int [arrayOne.length];

        for( int i=0; i<arrayOne.length; i++){
            sum[i]=arrayOne[i]+arrayTwon[i];//i=0,1,2,3,4,5 steps since there are 6 indexes of the arrayOne and arrayTwon


        }
        System.out.println(Arrays.toString(sum));
    }
}
