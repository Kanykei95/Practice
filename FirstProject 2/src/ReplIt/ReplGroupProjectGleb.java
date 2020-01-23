package ReplIt;

import java.util.Scanner;

public class ReplGroupProjectGleb {
    public static void main(String[] args) {

        //Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following
        // conditional actions:
        //Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
        //Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific
        // character is number or not number)
        //
        //Input: av$5yit8
        //Output: 58
        //
        //Input: abc23fd5hk7
        //Output: 2357

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter word:");
//        String str1 = input.next();
//
//        int i;
//        char str2;
//        String num;
//
//        if (str1.length() < 3 || str1.length() > 100) {
//            System.out.println("Invalid enter");
//        }else{
//            for (i = 0; i < str1.length(); i++) {
//                str2 = str1.charAt(i);
//                if (str2 >= 48 && str2 <= 57) {
//                    System.out.print(str2);
//                }
//            }
//        }
//
//    }
//}
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str1 = input.next();                      // enter a String str1 from user
        if (str1.length() < 3 || str1.length() > 100) { //Check if str1 has 3 or more characters,
            // if less than 3 or bigger than 100 character,
            System.out.println("Invalid enter");        //  print Invalid enter
        }
        for (int i = 0; i < str1.length(); i++) {
            char str2 = str1.charAt(i);                 //str2 - it's the char with index i, where is value i from 0 to str1.length()
            if (str2 >= 48 && str2 <= 57) {             // if str2 is number (0,1,2,3,4,5,6,7,8,9) we will print it.
                // 48 to 57 is range of char in ASCII Table for numbers
                System.out.print(str2);
            }
        }
    }
}