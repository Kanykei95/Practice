package SwitchStatement;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your age");
        int age = scanner.nextInt();



         if(age>100||age<0) {
             System.out.println("Not a valid age");
         }else if(age>=30){
                System.out.println("Welcome to the building");
        }else{
            System.out.println("Sorry try again when you're 30");
        }









    }
}
