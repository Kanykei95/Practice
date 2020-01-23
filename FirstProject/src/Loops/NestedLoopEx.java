package Loops;

public class NestedLoopEx {
    public static void main(String[] args) {

        for ( int i= 0; i<5; i++){

            for (int j=0; j<5; j++){
                System.out.println("j is equal to: " + j);

            }
            System.out.println("i is equal to: "+ i);
        }
    }
}
