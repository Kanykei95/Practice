package Arrays;

import java.util.Arrays;

public class FindingTheBiggestWord {
    public static void main(String[] args) {

        //Given the String:
        //"Write a program that creates a group of given size thisisabigword”
        //Find the biggest word in your String and print it.

        String str = "Write a program that creates a group of given size thisisabigword";
        String [] regular = str.trim().toLowerCase().split(" ");//turning into string array.
                //trim is to get rid of any extra spaces..

        int biggestLength = 0;

        for(String word: regular){//for each loop wprd, reading from array

            if(word.length()>biggestLength){//word length is every element, and every element is a String
                biggestLength=word.length();
            }
        }
        for(String word: regular){
            if(word.length()==biggestLength){
                System.out.println(word);
            }
        }



        }
    }

