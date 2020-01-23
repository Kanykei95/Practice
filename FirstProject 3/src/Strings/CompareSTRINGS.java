package Strings;

import java.util.Scanner;

public class CompareSTRINGS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String enterByUser1= input.nextLine();

        String enterByUser2 = input.nextLine();

        int comparingStrings = enterByUser1.compareTo(enterByUser2);

        System.out.println(comparingStrings);
    }
}
