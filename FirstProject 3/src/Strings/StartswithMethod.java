package Strings;

import java.util.Scanner;

public class StartswithMethod {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String word = "Java";

        boolean check1 = word.startsWith("Ja") && word.equalsIgnoreCase("java");
        System.out.println(check1);



    }
}
