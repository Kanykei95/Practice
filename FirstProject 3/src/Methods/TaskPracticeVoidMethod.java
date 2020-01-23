package Methods;

public class TaskPracticeVoidMethod {
    public static void main(String[] args) {

        //Create a method that prints “Hello” 50 times
        //Create a method that print odd numbers up to 100.


        Hello();
        printOddNumber();
    }

    public static void Hello(){
        for(int i=0; i<50;i++) {
            System.out.println("Hello" + (i+1));//+1 because it starts to initialize at 0.
        }
    }
    public static void printOddNumber(){
        for(int i = 1; i<100; i++){
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }


}

