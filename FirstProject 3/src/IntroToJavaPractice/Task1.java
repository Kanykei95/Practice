package IntroToJavaPractice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Name");
        String name = input.nextLine();

        System.out.println("Gender");
        char c = input.nextLine().charAt(0);

        System.out.println("age");
        String age = input.nextLine();

        System.out.println("Phone number");
        long number = input.nextLong();

        System.out.println("GPA");
        double gpa = input.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Gender: " + c);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + number);
        System.out.println("GPA number: " + gpa);





    }

}
