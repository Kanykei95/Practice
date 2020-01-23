package ReplIt;

import java.util.Scanner;

public class PArty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease enter guest name: ");
        String name = input.nextLine();


        // your code
        // ---------------------
       // -------------------
        String sum= "";


        for(;;){

            System.out.println("Do you want to enter new guest name: " );
            String answer= input.nextLine();

            if(answer.equals("yes")){
                System.out.println("Please enter guest name: ");
                String name2 = input.nextLine();
                sum+=name2;
            }else if(answer.equals("no")){
                break;

            }

        }
        System.out.println("Guest's list: " + name+", " +sum);

    }
}
