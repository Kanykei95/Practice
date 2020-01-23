package Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        //Write a program that asks from the user infinitely:
        //if user enters "hi" your program answers "hello", if user enters "bye" your program says "good bye"
        //Flow:
        //> hi
        //Hello
        //> bye
        //Good bye
        //> james
        //Good bye
            for (; ;){
                String userInput = input.nextLine();

                if (userInput.equalsIgnoreCase("hi")){
                    System.out.println("Hello");
                }else if( userInput.equalsIgnoreCase("bye")){

                    System.out.println("Good Bye");

                }else{
                    System.out.println("Bye forever");
                    break;
                }

            }


















    }
}
