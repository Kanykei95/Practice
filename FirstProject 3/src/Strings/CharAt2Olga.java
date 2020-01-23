package Strings;

public class CharAt2Olga {
    public static void main(String[] args) {
        String str = "MacDonalds";

        String str1 = str.substring(0,3);

        char c1 = str.charAt(0);
        char c2= str.charAt(1);
        char c3= str.charAt(2);

        System.out.println(str1);
        System.out.println(""+c1+c2+c3);

        char last_letter = str.charAt(str.length()-1);
        char second_last_letter = str.charAt((str.length()-2));

        System.out.println(last_letter);
        System.out.println(second_last_letter);

    }
}
