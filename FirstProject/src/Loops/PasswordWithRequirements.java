package Loops;

import java.util.Scanner;

public class PasswordWithRequirements {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;
        int specialCharacter = 0;
        if (str.length() >= 8) {
            for (int i = 0; i <= str.length()-1; i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    uppercase++;
                }
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    lowercase++;
                }
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    digit++;
                }
                if (str.charAt(i) >= 32 && str.charAt(i) <= 47) {
                    specialCharacter++;
                }
            }
            if (uppercase > 0) {
                if (lowercase > 0) {
                    if (digit > 0) {
                        if (specialCharacter > 0) {
                            System.out.println("Your password is accepted");
                        } else {
                            System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.");
                        }
                    } else {
                        System.out.println("Password should contain at least 1 digit");
                    }
                } else {
                    System.out.println("Password should contain at least 1 lowercase number");
                }
            } else {
                System.out.println("Password should contain at least 1 uppercase number");
            }
        } else {
            System.out.println("Password should contain minimum 8 characters");
        }














    }
}
