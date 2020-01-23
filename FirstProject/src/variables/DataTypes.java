package variables;

public class DataTypes {

    public static void main(String[] args) {

        int number = 5;

        System.out.println("This is your number: " + (number + 5));
        System.out.println();

        System.out.println("This is your number: " + number + 5);
        System.out.println("This is your number: " + number + "5");

        int numberOfApples = 10;
        int numberOfOranges = 5;
        System.out.println("Apples: " + numberOfApples);
        System.out.println("Oranges: " + numberOfOranges);

        numberOfApples = 8;
        numberOfOranges = numberOfApples;
        System.out.println("Apples after: " + numberOfApples);
        System.out.println("Oranges after " + numberOfOranges);
        System.out.println();


        int wildCats = 20;
        int pets = 0;
        System.out.println("Wild: " +  wildCats);
        System.out.println("Pets: "  + pets);
        System.out.println();

        wildCats = 15;
        pets = 5;
        System.out.println("Wild: " + wildCats);
        System.out.println("Pets: " + pets);
        System.out.println();

        wildCats = 10;
        pets = 10;
        System.out.println("Wild: " + wildCats);
        System.out.println("Pets: " + pets);
        System.out.println();
        System.out.println();
        System.out.println();



        //Task String
        // You have variables: first name and variable last name
        // Another variable: email
        // firstName + lastName + @cybertek.com
        // print in this format:

        // First name: the first name
        // last name: the last name
        // email: the email


        String firstName = "Kanykei";
        String lastName = "Apsalbekova";
        System.out.println(firstName + lastName + "@cybertek.com");


        // Task 2 Casting *** look at the table on powerpoint October 5
        //        // you have number of chairs stored as a short datatype with the value of 5
        //        //More chairs were ordered so we need something to store more chairs
        //        //change the chair datatype to long
        //        //you realize you now have too much storage
        //        // change the chair datatype to int.

        short chairs = 5;
        long moreChairs = chairs;
        int lessChairs = (int) moreChairs;
        System.out.println(lessChairs);
        System.out.println((double) lessChairs);
        System.out.println();
        System.out.println();



        //Task 3
        // You have three numbers: 15, 23, 367
        //Print the average of there numbers.

        int a=15;
        int b=23;
        int c=367;
        int sum= a+b+c;
        int avg= sum/3;
        System.out.println(avg);

        // Task 3.1 (Reassignment)
        //you have three numbers: 10,20,30
        // print the average of three numbers.

        a=10;
        b=20;
        c=30;
        sum= a+b+c;
        avg=sum/3;
        System.out.println(avg);


        //Task 4
        //You have a temperature in Fahrenheit: 72.5
        //Print out the temperature in celsius
        //Formula: degrees celsius = 5 (degrees F - 32) / 9

        double tempF = 72.5;
        double tempC= 5 * (tempF-32)/9;
        System.out.println(tempC);


        // Explicitely casting example.

        //byte b = 45;
       // int i = b;
       // short s = (short) i;
       // System.out.println(i);
        //System.out.println();


        // Find even or odd number using remainder

        int size = 32;
        int result = size % 2;
        System.out.println(result);
        System.out.println(size);
        size= 45;
        System.out.println(size);
        result= +4;
        System.out.println(result);
        result+=4;
        System.out.println(result);













       }

        }
