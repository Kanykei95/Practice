package IfElseStatements;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mass in kilogram");
        double mass = input.nextDouble();

        System.out.println("Enter your height in meters");
        double height = input.nextDouble();

        double BMI = mass/(height*height);

        if (BMI<18.5){
            System.out.println("underweight");
        } else if (BMI>=18.5 && BMI<25){
            System.out.println("Normal weight");
        } else if (BMI>=25 && BMI<0){
            System.out.println("overweight");
        } else if (BMI>=30){
            System.out.println("Obese");
        }


        //BMI: Program will ask user to enter their mass (pounds) and their height (feet). Calculate their BMI and then
        // print the appropriate message based on the provided values:
        //—> BMI Formula: BMI = mass / height^2
        //—> Values:
        //Less than 18.5 — Underweight
        //From 18.5 to 25 — Normal weight
        //From 25 to 30 — Overweight
        //More than or equal to 30 — Obese












    }
}
