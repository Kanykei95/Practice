package Loops;

public class MultiplicationNestedLoop {
    public static void main(String[] args) {

        //Create a multiplication table to print in the following format including all the multiples of 1-10 all the way through the multiples of 10:
        //1 x 1 = 1
        //1 x 2 = 2
        //1 x 3 = 3
        //1 x 4 = 4
        //1 x 5 = 5
        //1 x 6 = 6
        //1 x 7 = 7
        //1 x 8 = 8
        //1 x 9 = 9
        //1 x 10 = 10
        //-------------
        //2 x 1 = 2
        //2 x 2 = 4
        //2 x 3 = 6
        //2 x 4 = 8
        //2 x 5 = 10
        //2 x 6 = 12
        //2 x 7 = 14
        //2 x 8 = 16
        //2 x 9 = 18
        //2 x 10 = 20
        //-------------
        //Col

        for(int i=1; i<=10; i++){

            for( int j=1; j<=10; j++){

                System.out.println(i+ " x " + j +" = " + (i*j));
            }
            System.out.println("--------------------------");
        }
    }
}
