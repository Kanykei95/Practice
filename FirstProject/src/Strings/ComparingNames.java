package Strings;

import java.util.Scanner;

public class ComparingNames {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter first person name");
        String name1= input.nextLine().trim();
        String name2= input.nextLine().trim();

        String las1 = name1.substring(name1.indexOf(" ")+1);
        String last2 = name2.substring(name2.indexOf(" ") +1);

        if(las1.equals(last2)){
            System.out.println("relatives");
        }else{
            System.out.println("not relatives");
        }















    }
}
