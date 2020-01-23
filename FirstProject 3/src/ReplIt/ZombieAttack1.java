package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {

//        Scanner input = new Scanner (System.in);
//        int[] inhabitants = new int [8];
//        for(int i=0; i<inhabitants.length; i++){
//            inhabitants[i]=input.nextInt();
//
//        }
//                String checked = "";
//        int count =0;
//            for(int i=0; i<inhabitants.length; i++){
//                checked +=inhabitants[i]/2+" ";
//                count++;

//            }
//
//        System.out.println(checked);

        public static void main(String[] args) {
            int [] array_zero = {0,0,0,0,0,0,0,0};
            int[] populations = {3, 6, 0, 4, 3, 2, 7, 1};
            int days=0;
            while (!Arrays.equals(populations,array_zero)) {
                System.out.println("Day "+ days+" "+Arrays.toString(populations));
                for (int j = 0; j < populations.length; j++) {
                    populations[j] = populations[j] / 2;
                }
                days++;
            }
            System.out.println("Day "+ days+" "+Arrays.toString(populations));
        }
    }

