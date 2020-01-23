package Strings;

import java.util.Scanner;

public class NameTASK {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // user is asked to enter to enter their name. You will check if it is a cool name.
        //If the name begins with an 'a' or a 'z' print "Your name is cool"
        // otherwise print "Sorry not a cool name"

        System.out.println("Print your name");
        String name = input.nextLine();

        //if (name.charAt(0)=='a' || name.charAt(0)=='z'){
        //            System.out.println("cool name");
        //        }else{
        //            System.out.println("not a cool name");
        //        }

        if (name.startsWith("a")||name.startsWith("z")){
            System.out.println("Your name is Cool");

        }else{
            System.out.println("Sorry not a cool name");
        }





















    }
}
