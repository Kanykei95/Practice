package Arrays;

import java.util.Arrays;

public class   SplitEx {
    public static void main(String[] args) {
        String str = "Java is programming language";
        String [] regular = str.trim().toLowerCase().split(" ");
        System.out.println(Arrays.toString(regular));
    }
}
