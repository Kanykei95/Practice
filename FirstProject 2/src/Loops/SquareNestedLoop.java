package Loops;

import java.util.Scanner;

public class SquareNestedLoop {
    public static void main(String[] args) {
        //Write a program that asks the user to enter a number. The number will be how big your square will be. Square made of ‘#’ sign
        //> input: 5
        //> output:
        //# # # # #
        //# # # # #
        //# # # # #
        //# # # # #
        //# # # # #

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = input.nextInt();

        for (int n=1; n<=num+3; n++){ // +3 because we need 5 rows and +3=8 length...!!!!!!!!!!!

            for( int j =1; j<=num; j++){
                System.out.print("# ");

            }
            System.out.println();
        }
    }
}
