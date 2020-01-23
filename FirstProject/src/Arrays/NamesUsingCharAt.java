package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NamesUsingCharAt {
    public static void main(String[] args) {
            // Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
        //Loop through each elements of students. - print first character of each name on each line.


        String [] names = {"James", "Sam", "Adam", " Elize", "Jamie", "Benzema", "Sandy" };
        System.out.println(Arrays.toString(names));

        for (int i=0; i< names.length; i++ ){
                int last = names[i].length()-1;
            System.out.println(names[i].charAt(last));


        }
        for ( int i=0; i<names.length; i++){
            if(names[i].toLowerCase().endsWith("s")){
                System.out.println(names[i]);

            }
        }

        for ( int i=0; i<names.length; i++){
            if(names[i].toLowerCase().contains("s")){
                System.out.println(names[i]);

            }
        }

        System.out.println();

        System.out.println("enter a string");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();

        for(int i =0; i< names.length; i++){
            if(names[i].toLowerCase().contains(user)){
                System.out.println(names[i]);
            }
        }

























    }


}
