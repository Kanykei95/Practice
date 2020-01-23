package Loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //int num = 0;
        //while(num < 15) {
          //  System.out.println(num++);
       // }

        Scanner in = new Scanner(System.in);
        System.out.println("enter name");
        String name = in.nextLine();
        while (name.startsWith("j")){
            System.out.println("enter name");
            name = in.nextLine();
        }






    }
}
