package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        //Write a program that asks the number of cars user has and create an array of String with given size. Then ask the user to enter each car. After getting all the cars, print the array.
        //Flow: Enter number of cars: > 3 Enter car 1: > BMW Enter car 2: > Mercedes Enter car 3: > Toyota
        //[BMW, Mercedes, Toyota]
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Cars:");

        int numOfCars = input.nextInt();
        input.nextLine();

        String [] myCars = new String[numOfCars];



        for( int i = 0; i< myCars.length; i++ ){
            System.out.println("Enter car " + (i+1));//i+1 so that it prints and starts with 1
            String car = input.nextLine();

            myCars[i]=car;//takes first car

        }
        System.out.println(Arrays.toString(myCars));

    }
}
