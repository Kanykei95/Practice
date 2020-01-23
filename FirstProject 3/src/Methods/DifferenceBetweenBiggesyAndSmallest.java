package Methods;

import Loops.number;

import java.util.Arrays;

public class DifferenceBetweenBiggesyAndSmallest {
    //Given a String of numbers. Return the difference between the biggest and smallest number

    //smallest number
    // input "8323234";
    //output 6
    public static void main(String[] args) {
        System.out.println(differenceFromString("9323234"));

    }


    public static int differenceFromString(String number) {
        String[] arr = number.split("");
        Arrays.sort(arr);
        return Integer.valueOf(arr[arr.length - 1]) - Integer.valueOf(arr[0]);


    }
}
