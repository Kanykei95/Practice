package ReplIt;

import java.util.Scanner;

public class StringMiddleThree {
    public static void main(String[] args) {


        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        int middle = n1.length() / 2;

        if (n1.length() >= 5) {
            System.out.println(n1.substring(middle - 1, middle + 2));

        }
    }
}







