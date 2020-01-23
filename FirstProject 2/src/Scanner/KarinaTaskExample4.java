package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KarinaTaskExample4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 numbers");
        int age1 = input.nextInt();
        int age2 = input.nextInt();
        int age3 = input.nextInt();
        int age4 = input.nextInt();
        int age5 = input.nextInt();
        int age6 = input.nextInt();
        System.out.println("What is the average?");
        int avg= (age1+age2+age3+age4+age5+age6)/6;
        System.out.println(avg);
        int remainder = (avg%6);
        System.out.println("The remainder is" + remainder);
        int number = (age1+age2+age3+age4+age5+age6);
        int evenOrOdd = (number%2);
        System.out.println(evenOrOdd);
        input.nextLine();
        System.out.println("Even or Odd? ");
        String answer = input.nextLine();
        System.out.println("Your number is " + answer);


























    }



















}
