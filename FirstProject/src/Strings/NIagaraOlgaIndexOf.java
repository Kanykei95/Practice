package Strings;

import java.util.Scanner;

public class NIagaraOlgaIndexOf {
    public static void main(String[] args) {

        String str="Niagara, o roar again!";

        int index_of_first_a = str.indexOf("a");
        int index_of_first_ga = str.indexOf("ga");
        int index_of_roar = str.indexOf("roar");

        System.out.println("position of first a " + index_of_first_a);
        System.out.println("position of first ga " + index_of_first_ga);
        System.out.println("position of roar " + index_of_roar);

        int index_of_second_a= str.indexOf("a", index_of_first_a+1);
        System.out.println("position of second a " + index_of_second_a);

        int index_of_third_a = str.indexOf("a", index_of_second_a+1);
        int index_of_fourth_a = str.indexOf("a",index_of_third_a+1);
        System.out.println("position of third a " + index_of_third_a);
        System.out.println("position of fourth a " + index_of_fourth_a);
    }
}
