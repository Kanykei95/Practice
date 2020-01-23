package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        RandomArr(7, 100);
        System.out.println(Arrays.toString(RandomArr(7,100)));
    }



    public static int [] RandomArr (int size, int bound){
        int [] array = new int [size];
        Random random= new Random();
        for(int i=0; i<array.length;i++){
            array[i]=random.nextInt(bound);
        }
        return array;






    }

}
