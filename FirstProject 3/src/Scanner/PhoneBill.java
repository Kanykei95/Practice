package Scanner;

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();

        if (numberOfCall<100){
            bill=200.00;
            System.out.println("Your bill is " + bill);

        }else if (numberOfCall>100&&numberOfCall<150){
            bill = 200.00+numberOfCall%100*0.60;
            System.out.println("your bill is " + bill);
        }else if (numberOfCall>150&&numberOfCall<200){
            bill = 200.00 + numberOfCall+50*0.60+numberOfCall%150*0.50;
            System.out.println("your bill is" + bill);
        }else {
            bill = 200.00 +50*0.60+50*0.50+numberOfCall%200*0.40;
            System.out.println(bill);

        }

















    }
}
