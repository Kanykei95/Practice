package SwitchStatement;


import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter grade");
        char grade = input.nextLine().charAt(0);

        switch (grade) {
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'B':
                System.out.println("Great");
                break;
            case'c':
            case 'C':
                System.out.println("Okay");
                break;
            case 'd':
            case 'D':
                System.out.println("You can do better");
                break;
            case 'f':
            case 'F':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println("Not a valid letter grade");


                //Ask user to enter their letter grade, take it as a character. Give them back some result based on
                // their letter grade.
                //a --> Excellent!
                //b --> Great!
                //c --> Okay
                //d --> You can do better
                //f --> Something needs to change
                //if none of these letter --> Not a valid letter grade
                //--> Bonus: Take into consideration if the user puts a capital or lower case letter. The results
                // for a and A should be the same




        }


















    }
}
