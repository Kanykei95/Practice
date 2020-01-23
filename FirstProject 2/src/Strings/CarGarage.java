package Strings;

import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //You have a car garage with these car brands. You will check the cars and print the following messages:>
        // If the garage is empty print “No cars in your garage” >
        // If you have a Toyota or Nissan print “There is a
        // Japanese car in your garage”>
        // If you have a BMW print “There is a German car in your garage”>
        // If you have
        // a Maserati print “There is an Italian car in your garage”>
        // If you have a Jaguar print “There is a British
        // car in your garage”—>
        // If the garage does not have a car of that type, print “No x cars".

        String cars = "Toyota, BMW, Jaguar";


        if(cars.isEmpty()){
            System.out.println("No cars in your garage");

        }if (cars.contains("Toyota") || cars.contains("Nissan")){
            System.out.println("There is a Japanese car in your garage");

        } else{
            System.out.println("There is no Japanese car");
        }
        if (cars.contains("BMW")){
            System.out.println("There is a German car in your garage");
        }else {
            System.out.println("There is German car");
        }

        if (cars.contains("Maserati")){
            System.out.println("There is an Italian car in your garage");

        } else {
            System.out.println("There is no Italian car");
        }

        if (cars.contains("Jaguar")){
            System.out.println("There is a British car in your garage");

        }


        else {
            System.out.println("There is no British");
        }















    }
}
