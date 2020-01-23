package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KarinaTaskExample1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner  (System.in);
        //Choose a 5 digit number of apples that you have. You decided to give them away to your Cybertek class.
        //There are 70 females, 30 males in your class. Each female in your class got 85 apples. Each male in your class
        //got 45 apples.
        // The rest of your apples you gave to the staff of Cybertek.
        //How many apples did the staff get?

        System.out.println("choose a 5 digit number");
        int number = scanner.nextInt();
        int numberOfFemales = 70;
        int numberOfMales = 30;

       int femaleApple= (numberOfFemales *85);
       int maleApple = (numberOfMales *45);
       int allApples = (number - femaleApple - maleApple);
        System.out.println("The Staff got " + allApples);
        //also can be written like this:
        //femalApple *= 85;
        //maleApple *= 45;
        //int total = femaleApple + maleApple;
        //System.out.println(number - total);









    }

























}
