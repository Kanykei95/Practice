package SwitchStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Create a calculator using a switch statement
        //> User enters two numbers (int) and an operator(String of [+ , - , * , / ] )
        //>Ex: 3,4,”+”      output: 3+4 = 7 ( this whole statement should be shown)
        //> If operator provided isn’t one of the options, user should see message: “invalid operator”

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one");
        double num1 = input.nextDouble();
        System.out.println("enter number two");
        double num2 = input.nextDouble();

        input.nextLine();

        System.out.println("Choose operators from *,-,+,/");
        String operator = input.nextLine();
        double result = 0;
        boolean valid = true;


        switch (operator){
            case "*":
                result= num1 * num2;
                break;
            case "+":
                result= num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "/":
                result = num1/num2;
                break;
            default:
                System.out.println("Invalid Operator");
                valid = false;
        }
        if(valid) {
            System.out.println(num1 + operator +  num2 + "= " + result);
        }






    }
}
