package Scanner;

import java.util.Scanner;

public class Retirement {

    public static void main(String[] args) {
        //Create a number variable for age. Create another variable that has a value of :[65 - the given age].
        //Then print the resulting age in this format: Because you are: givenAge years old and will retire in: \
        //secondAge years.
        // input:23
        // output: Because you are: 23 years old and will retire in:42 years

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        int retirementAge = 65;
        int result = retirementAge - age;

        System.out.println("Because you are " + age + ", you will retire in " + result + " years ");



    }

    }
