package Strings;

public class OlgaSlackTask7 {
    public static void main(String[] args) {
        //you have two strings: string 1 «Burger with fries», string 2 «Burger with mushed potato».
        //Create two separated if statements.
        //First will be check if these two strings are equal - if it is true - print out «What?» - if it is false -
        // print out «Yes they are different»
        //Second if statement will check if both strings contains «Burger»
        //( if str1.contains(«Burger») and (str2.contains ( «Burger» ))
        //If it is true  - print out «You eat too many burgers»
        //If it is false - print out «Good for you»
        //Collapse

        String s1 = "Burger with fries";
        String s2 = "Burger with mashed potato";

        if (s1==s2){
            System.out.println("What?");
        }else{
            System.out.println("yes they are different");

        }
        System.out.println();

        if(s1.contains("Burger")&&s2.contains("Burger")){
            System.out.println("You eat too many burgers");

        }else{
            System.out.println("Good for you");
        }









    }
}
