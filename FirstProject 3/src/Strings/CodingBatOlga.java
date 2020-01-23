package Strings;

import java.util.Scanner;

public class CodingBatOlga {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String word= input.nextLine();
        int length = word.length();

        if(word.isEmpty()){
            System.out.println("");

        }else{
            String result = word.substring(1, word.length()-1);
            System.out.println(result);
        }
    }
}
