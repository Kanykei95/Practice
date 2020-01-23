package Arrays;

import java.util.Arrays;

public class UniqueValueTask {
    public static void main(String[] args) {
        //Given an array of values: 23, 1, 34, 3, 54, 54, 51
        //Print the biggest two values. Only Unique values
        //> The result here should be:

        int [] nums = {23,1,34,3,54,54,51};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        String check= "";
        int count=0;
        for(int i=nums.length-1;  i>=0; i--){//i>=0:Runs loops when its above 0, and decrement -- so it reads and goes backwards..

            if(count==2){//prints 2 biggest numbers
                break;
            }

            if(!check.contains(nums[i]+"")){//doesnt contain, also here it checks if the number is in the String
                // thats how it prints unique numbers.
                System.out.println(nums[i]);
                check+=nums[i]+" ";// space here to have spaces in between the numbers.
                count++;
            }

        }







    }
}
