package Arrays;

import java.util.Arrays;

public class LoopingThrough {
    public static void main(String[] args) {

        String[] names = new String[3];
        System.out.println(Arrays.toString(names));
        names[0] = "jamie";
        names[1] = "boB";
        names[2]= "nemo";

        for(int i =0; i<names.length; i++){
            System.out.println("name " + (i+1) + " is " + names[i]);
            //System.out.println("name" + (i+1) + "is" + names[i].charAt(0);

        }












    }
}
