package Scanner;

import java.util.Scanner;

public class GroupPractice {
    public static void main(String[] args) {
        // we have 7 variables, find the average of the 7 variables.



        Scanner scanner = new Scanner(System.in);
        System.out.println("first");
        int first = scanner.nextInt();
        System.out.println("second");
        int second = scanner.nextInt();
        System.out.println("third");
        int third = scanner.nextInt();
        System.out.println("fourth");
        int fourth= scanner.nextInt();
        System.out.println("fith");
        int fith = scanner.nextInt();
        System.out.println("sixth");
        int sixth= scanner.nextInt();
        System.out.println("seventh");
        int seventh = scanner.nextInt();

        int avg = ( first + second + third + fourth + fith + sixth + seventh / 7);
        System.out.println("The result: " + avg);


        avg += 200;
        System.out.println("New result " + avg);


















}
}
