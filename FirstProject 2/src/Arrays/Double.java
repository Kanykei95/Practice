package Arrays;

import java.util.Arrays;

public class Double {
    public static void main(String[] args) {
    //Declare and initialize double array for prices.
//Store following prices:
//45.99, 23.5, 11.50, 33.33, 99.99.
//Print the values then change the last element to 112.89.
//Print all values again

        //double[] price = new double[5];
       // price[0] = 45.99;
       // price[1] = 23.5;
       // price[2] =11.50;
        //price[3] = 33.33;
        //price [4] = 99.99;
        //System.out.println(Arrays.toString(price));

        //price [4] = 112.89;
      //  System.out.println(Arrays.toString(price));


        //OR:This way


        double [] arr = {45.99, 23.5, 11.50, 33.33, 99.99};
        System.out.println(Arrays.toString(arr));
        arr [arr.length-1] = 112.89;

        System.out.println(Arrays.toString(arr));









    }
}
