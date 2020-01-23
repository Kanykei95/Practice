package Arrays;

import java.util.Arrays;

public class FourNames {
    public static void main(String[] args) {
        //Create String array size of 4;
        //Store 4 names in that array. Give a proper name for your array variable. Make sure to assign value for
        // every single index. Print out second and third names on separate lines.

        String[] names = new String[4];
        System.out.println(Arrays.toString(names));
        names[0] = "amelia";
        names[1] = "kana";
        names[2]= "aza";
        names [3] = "sean";
        System.out.println(Arrays.toString(names));

        System.out.println(names[1]);
        System.out.println(names[2]);














    }
}
