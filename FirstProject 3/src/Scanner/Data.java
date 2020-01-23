package Scanner;


import java.util.Scanner;

public class Data{

    public static void main(String[] args) {
//     String name = " James";
//     String lastName = "Bond";
//     int age = 45;
//     String location = "London, UK";
//     boolean isHeOk= true;
       Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome," + name + "!");
        System.out.println("Where are you from " + name + "?");
        String from = input.nextLine();
        System.out.println(from + " is a cool place.");
        System.out.println(name + " , How old are you?");
        int age = input.nextInt();
        System.out.println(age  + " age is fun!");




    }
















}
