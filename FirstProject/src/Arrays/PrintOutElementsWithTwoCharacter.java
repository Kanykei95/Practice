package Arrays;


import java.util.Arrays;

public class PrintOutElementsWithTwoCharacter {
    public static void main(String[] args) {
        //Given a String of: "knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can”, “fridge”,
        // “dish washer”
        //Go through the array and print the value if there is multiple words.

        String [] arr = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge",
                "dish water"};
        for (int i=0; i<arr.length;i++){
           // if(arr[i].tim().contains(" ")){// trim bc.if the word starts with space trim will cut the space and
            // read the work once.
            if(arr[i].contains(" ")){
                System.out.println(arr[i]);
            }
        }
    }
}
