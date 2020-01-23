package Loops;

import java.util.Scanner;

public class RaisedToThePower {
    public static void main(String[] args) {


            //write your code
            Scanner input = new Scanner (System.in);
            int num1 = input.nextInt();
            int num2 = input. nextInt();
            int result= 1;


            for ( int i = 1; i<=num2; i++ ){
                result*=num1;

            }
            System.out.println("Result: " + result);







        }
}
