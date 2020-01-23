package Strings;

public class OlgaSubstring {
    public static void main(String[] args) {

        String str1 = "Love is all around the world!";//29 length/2 14 and 1 left

        String str2 = str1.substring(0,3);
        String str3 = str1.substring(5);


        System.out.println(str2);
        System.out.println(str3);
        int length = str1.length();

        String first_half_of_sentence = str1.substring(0, length/2);
        System.out.println("length is " + length);
        System.out.println("first half of the sentence " + first_half_of_sentence);
        int length_first_half = first_half_of_sentence.length();
        System.out.println("length of first half is: " + length_first_half);



    }
}
