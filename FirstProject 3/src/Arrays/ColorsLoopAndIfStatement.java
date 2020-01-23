package Arrays;

import java.util.Arrays;

public class ColorsLoopAndIfStatement {
    public static void main(String[] args) {
//Part II
//Print the color names if the length of the color is 4 or more.
        String[] colors = new String[4];
        System.out.println(Arrays.toString(colors));
        colors[0]= "pink";
        colors[1]= "white";
        colors[2] = "red";
        colors [3] = "silver";

         for ( int i =0; i<colors.length; i++){

             if( colors[i].length()>=4){
                 System.out.println(colors[i]);
             }
         }


    }
}
