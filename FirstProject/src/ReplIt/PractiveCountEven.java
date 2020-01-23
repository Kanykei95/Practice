package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class PractiveCountEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below
            int even = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2==0){
                even++;



            }
        }
        System.out.println(even);
    }
}


