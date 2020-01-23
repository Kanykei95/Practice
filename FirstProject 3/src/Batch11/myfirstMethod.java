package Batch11;

public class myfirstMethod {
    public static void main(String[] args) {


        String name = "James";
        System.out.println(name);
        for (int i=0; i<4; i++){
            printPositivity();//or we can just print this how ever many times instead of making loop, works too!
        }


    }
    public static void printPositivity(){
        System.out.println("Hello, World!");
        System.out.println("It is awesome day today!!!");
    }
}
