package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KarinaTaskExample3 {
    public static void main(String[] args) {
        // Come up with 6 amounts of money you are willing to save up every month throughout half a year.
        //You are willing to spend 1/3 of your saved up money on a new bike. How much money will you have left?
        //*** keep in mind that int doesnt show the decimal points when you do 1/3; it will show a whole

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        System.out.println("How much money do I have saved up");
        int savedUpMoney= (num1+num2+num3+num4+num5+num6);
        System.out.println(savedUpMoney);
        System.out.println("How much money spend?");
        int moneySpend= (savedUpMoney/3);
        System.out.println(moneySpend);
        int moneyLeft= (savedUpMoney-moneySpend);
        System.out.println(moneyLeft);

























    }
}
