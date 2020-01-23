package Olgasession;

import java.util.Scanner;

public class ReplItTaskReviewUsingDoWhileLoop {
    public static void main(String[] args) {


        //Write a program to prompt the user to enter the numbers till the user wants (by asking user
        // if he wants to continue) and at the end it should display the count of positive, negative and
        // zeros entered. (Hint: use do while loop)
        //
        //	Example:
        //
        //        Input:
        //	Enter the number: 9
        //	Do you want to continue y/n? y
        //	Enter the number: -5
        //	Do you want to continue y/n? y
        //	Enter the number: 0
        //	Do you want to continue y/n? y
        //	Enter the number: 66
        //	Do you want to continue y/n? n
        //
        //        Output:
        //	Positive numbers: 2
        //	Negative numbers: 1
        //	Zero numbers: 1
        Scanner input = new Scanner(System.in);
        int num = 0;//Declare number here or else it will declare multiple times all time if inside the do while loop
        String answer = "";

        int positive=0;
        int negative=0;
        int zero=0;


        do {
            System.out.println("Enter the number: ");
            num = input.nextInt();

            if(num>0){
                positive++;

            }else if(num<0){
                negative++;

            }else{
                zero++;
            }

            input.nextLine();
            System.out.println("Do you want to continue? ");
            answer = input.nextLine();

        } while (answer.toLowerCase().startsWith("y"));
        System.out.println("[psitive "+positive);
        System.out.println("Negative "+negative);
        System.out.println(zero);





















    }
}
