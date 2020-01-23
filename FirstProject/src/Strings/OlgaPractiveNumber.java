package Strings;

public class OlgaPractiveNumber {
    public static void main(String[] args) {

        String str = "Niagara  O roar again!";

        int length_of_string = str.length();
        System.out.println("The length of the string is " + length_of_string);

        // Method compareTo -
        String str2 = "abc";
        String str3 = "abd";
        int compareToResult = str2.compareTo(str3);
        System.out.println("compare result is " + compareToResult);
    }
}
