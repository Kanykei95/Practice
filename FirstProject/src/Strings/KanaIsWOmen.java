package Strings;

import java.util.Scanner;

public class KanaIsWOmen {
    public static void main(String[] args) {

        String word = "Kana is a Women";
        String check1 = word.substring(5);
        System.out.println(check1);
        System.out.println();

       String check2 = word.substring(5,7);
        System.out.println(check2);
        System.out.println();

      int check3 = word.indexOf("W");
        System.out.println(check3);
      String check4 = word.substring(check3+1);
        System.out.println(check4);

        int check5 = word.indexOf("W");
        String check6 = word.substring(check5-2);
        System.out.println(check6);


















    }
}
