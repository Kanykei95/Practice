package Methods;

import java.util.Arrays;
import java.util.Scanner;

class ArrayMethod {

    public static void main(String[] args) {

        // create a method that will print negative numbers from a given int array
    int [] arr2 = {-1,3,-4,-2,32,2,-23,1};

   // printNegativeNumbers(arr2);

    changeNegativeNumbers(arr2,100);



    }
    public static void printNegativeNumbers(int [] arr) {
        for(int num: arr){
            if(num<0){
                System.out.println(num);
            }


        }


    }

    public static void changeNegativeNumbers ( int [] arr, int change){

        for(int i=0; i<arr.length;i++){
            if(arr[i] <0){
                arr[i]= change;

            }
        }
        System.out.println(Arrays.toString(arr));


    }

}
