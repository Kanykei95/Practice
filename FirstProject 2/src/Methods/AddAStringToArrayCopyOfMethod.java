package Methods;

import java.util.Arrays;

public class AddAStringToArrayCopyOfMethod {
    //Create a method that will take a String array and a String. Increase your array capacity and add the given
    // String as the last element of the new array. Return the new array
    public static void main(String[] args) {
        String [] arr= {"Kana","Aza","Amelia"};

        System.out.println(Arrays.toString(increaseArrCapacity(arr,"Sean")));
    }


    public static String [] increaseArrCapacity(String [] arr, String str){
        String [] arr2 = (Arrays.copyOf(arr,arr.length+1));
        arr2[arr2.length-1]= str;
        return arr2;

    }



}
