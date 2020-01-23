package Methods;

import java.util.Arrays;

public class AddNumbersToString {
    //Write a method that will take a String of numbers (9843263 for example) and an int. Add that second given number
    // to each other number and show each operation result as separate elements of an int array
    public static void main(String[] args) {
        addNumtoString("9843263",1);



    }

    public static void addNumtoString (String numbers, int add){
        //9843263,  1
        String [] arr = numbers.split("");
        int [] intArray = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            intArray[i]=Integer.valueOf(arr[i])+add;

        }
        System.out.println(Arrays.toString(intArray));



    }
}
