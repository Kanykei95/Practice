package Strings;

public class SubstringFirstWordOlga {
    public static void main(String[] args) {
        String str1 = "Love is around the world!";

        int index_of_1st_space = str1.indexOf(" ");

        String first_word= str1.substring(0, index_of_1st_space);
        System.out.println(first_word);


        int index_of2nd_space = str1.indexOf(" ", index_of_1st_space+1);
        String second_word=str1.substring(index_of_1st_space+1, index_of2nd_space);
        System.out.println(second_word);
    }
}
