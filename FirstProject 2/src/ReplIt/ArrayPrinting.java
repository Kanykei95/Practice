package ReplIt;

import java.util.Scanner;

public class ArrayPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below
        for(int j = 0; j<5;j++) {
            System.out.println(arr[0].substring(0, 3));
        }

    }
}
