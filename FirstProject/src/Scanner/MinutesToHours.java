package Scanner;

import java.util.Scanner;

public class MinutesToHours {

    public static void main(String[] args) {

//Write a program that calculates minutes into hours and minutes.
        // enter minutes:
        //89
        //output: 1 hour and 29 minutes

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is the minutes? ");
        int minutes = scanner.nextInt();
        int hours = minutes/60;
        int remainderMinutes = minutes%60;
        System.out.println(minutes + " minutes = " + hours + " hours and " + remainderMinutes + " minutes ");














    }













}
