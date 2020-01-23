package Scanner;

import java.util.Scanner;

public class KarinaTaskExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Choose a 3 digit number.Count how many full weeks you have in your number.
        //After calculating your full weeks, find the remainder of days in your number (the ones that didint make to
        //a full week.)
        //Calculate how many hours there are in your number of days.
        //Calculate how many minutes there are in your number of days.
        //Calculate how many seconds there are in your number of days.

        System.out.println("Choose a 3 digit number");
        int number= scanner.nextInt();
        int fullWeeks = number/7;
        System.out.println("There are " + fullWeeks);
        int remainderOfDays = number%7;
        System.out.println("Remainder is " + remainderOfDays);
        number *= 24;
        System.out.println("There are " + number + " hours in number of days.");
        number *= 60;
        System.out.println("There are " + number + " minutes in number of days.");
        number *= 60;
        System.out.println("There are " + number + " seconds in number of days.");


















    }
}
