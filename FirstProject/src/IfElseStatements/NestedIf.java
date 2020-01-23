package IfElseStatements;

public class NestedIf {
    public static void main(String[] args) {


        int number = 0;
        if (number>=0 && number <=50){
            if ( number >=10 && number <=40){
                if (number>20&& number <=30){
                    System.out.println("your number is good");
                } else{
                    System.out.println("not in the 20-30 range");
                }
            } else{
                System.out.println("not in the 10-40 range");
            }
        }else {
            System.out.println("not in the 0-50 range");
        }
















    }
}
