package Arrays;

import java.util.Arrays;

public class KarinaPracticeForEachLoop {
    public static void main(String[] args) {
        //Task is to stop reading when the element starts with letter b. Meaning print the words before the element starting with b which is banana.

        String [] arr = {"apple","orange","bannana","carrots"};


        for(String word: arr){
            if(word.startsWith("b")){
                break;
            }
            System.out.println(word);
        }
    }
}
