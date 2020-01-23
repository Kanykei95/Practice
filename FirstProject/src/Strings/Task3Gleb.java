package Strings;

import java.util.Scanner;

public class Task3Gleb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");

        //Check if str has 3 or more character, if less than 3 or bigger than 100 character, print only Invalid enter
        //Convert str to all lower characters
        //If number of character is odd convert middle character Upper case
        //If number of character is even convert middle two character Upper case (ex: name -> nAMe)

        //Sample Input:
        //apple
        //Sample Output:
        //apPle
        //
        //Sample Input:
        //BANANA
        //Sample Output:
        //baNAna
        //
        //Sample Input:
        //xy
        //Sample Output:
        //Invalid enter

        String str = input.nextLine();

        int midd = str.length()/2;

        if(str.length()<3||str.length()>100){
            System.out.println("Invalid enter");

        }
        if (str.length()>3){
            str=str.toLowerCase();

        }
        if (str.length()%2==1){
            String name1 = str.substring(0,midd);
            String name2= str.substring(midd,midd+1).toUpperCase();
            String name3 = str.substring(midd+1);
            String fullword= name1+name2+name3;
            System.out.println(fullword);
        }else{
            String name1= str.substring(0,midd-1);
            String name2 = str.substring(midd-1,midd+1).toUpperCase();
            String name3= str.substring(midd+1);
            String fullword= name1+name2+name3;
            System.out.println(fullword);
        }











    }
}
