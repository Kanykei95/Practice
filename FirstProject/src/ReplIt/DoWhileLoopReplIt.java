package ReplIt;

import java.util.Scanner;

public class DoWhileLoopReplIt {
    public static void main(String[] args) {

        //Write a program to prompt the user to enter the numbers till the user wants (by asking user if he wants to
        // continue) and at the end it should display the count of positive, negative and zeros entered.
        // (Hint: use do while loop)

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

        Scanner input = new Scanner (System.in);
//
        int number = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        String answer= "";

        do {
            System.out.println("Enter Number");
            number = input.nextInt();

            if (number>0){
                positive++;

            }else if (number<0){
                negative++;

            }else{
                zero++;
            }
            input.nextLine();

            System.out.println("Do you want to continue y/n? y");

            answer =  input.nextLine();


        }while (answer.equals("yes")||answer.equals("y"));

        System.out.print("positive: "+positive);
        System.out.println("negative: " + negative);
        System.out.println("zero numbers" + zero);









    }
}
