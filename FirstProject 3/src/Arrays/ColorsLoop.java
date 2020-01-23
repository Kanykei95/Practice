package Arrays;

import java.util.Arrays;

public class ColorsLoop {
    public static void main(String[] args) {
        //Create String array for the colors.
        //Initialize 4 colors.
        //Loop through each element using for loop and print each color names.

        String[] colors = new String[4];
        System.out.println(Arrays.toString(colors));
        colors[0]= "pink";
        colors[1]= "white";
        colors[2] = "blue";
        colors [3] = "silver";


        for ( int i =0; i<colors.length; i++){
            System.out.println("colors " + (i+1) + " is " + colors[i]);
        }



    }
}
