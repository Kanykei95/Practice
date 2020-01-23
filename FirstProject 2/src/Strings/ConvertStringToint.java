package Strings;

import java.util.Scanner;

public class ConvertStringToint {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        //User enters a sentence like this:
        //    > “I am x years old”
        //    We want to take their age and change it. Add 5 to their age and print: “In 5 years you will be:
        //    newAge years old”
        //> input: “I am 20 years old”
        //> output: In 5 years you will be 25 years old

        String str = in.nextLine(); //"I am x years old"
        int x = str.indexOf("am")+3;
        int years = str.indexOf("years");
        String age = str.substring(x,years-1);
        int ageNum = Integer.valueOf(age);
        ageNum += 5;
        System.out.println("In 5 years you will be " + ageNum);

    }
}
