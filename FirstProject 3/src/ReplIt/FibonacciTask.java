package ReplIt;

import java.util.Scanner;

public class FibonacciTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
    int n = input.nextInt();



    int fibonacci1 = 0;//1st variable
    //int b=0;
    int fibonacci2 = 1;//2nd variable


        for (int i = 1; i <= n; i++) {//starts with 1, and i<n(userInput), then increments by 1.
        System.out.print(fibonacci1+" ");// 1st variable + space. So the outcome numbers have space in between.
        int sum = fibonacci1 + fibonacci2;//create another variable where this will then become the main formula.
            //where both of the two variables numbers will be added and goes on and on.
      fibonacci1 = fibonacci2;
       fibonacci2 = sum;//This is where if the condition above is true, this is where it continues to run over again.
            //fibonacci1=b;
            //b=fibonacci2;
            //fibonacci2=fibonacci1+b;
            //System.out.println(fibonacci1+ " ");

    }
}























}

