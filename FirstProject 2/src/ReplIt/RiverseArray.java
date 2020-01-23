package ReplIt;

import java.util.Scanner;

public class RiverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n  = input.nextInt();

        // declare an array
        int arr[] = new int[n];
        System.out.println("Enter an array values");
        //INPUT ARRAY VALUES
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        int temp;

        int start =0;
        int end = n-1;
        // 1, 2, 3,4,5
        while(start<end){
            temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println("Printing an array after reverse");

        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }

    }
}
