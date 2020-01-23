package Operetors;

public class Increment {

    public static void main(String[] args) {
            int age = 5;
        System.out.println(age);    // 5

        System.out.println(++age);  // pre increment = 6
        System.out.println(age++);  // post increment = 6 after >7
        System.out.println(age);    // 7
        System.out.println();

        System.out.println(--age);
        System.out.println(age--);
        System.out.println(age);


        int x = 11;
        int y = x++;    //int y = 11; then x increments
        // int y = x;
        // x++;

        System.out.println("x=" + x);// The whole becomes a string, x is not
        System.out.println("y=" + y);// a number anymore, it is characters
        System.out.println(y);
        System.out.println();

        int book = 10;

        System.out.println(book++);     // 10 is printed then incremented --> 11
        System.out.println(++book);     //11 increments --> 12, then it prints

        System.out.println(book); //12

        System.out.println(book--);     //12 is printed, then it decreased --> 11
        System.out.println(--book);     //11 --> 10 then prints
        System.out.println();// 10
        System.out.println();

        int a = 10;
        int c = 8;

        System.out.println(true || a++ > c);
        System.out.println(a);





    }
}
