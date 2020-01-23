package Methods;

public class Task2PracticeVoidMethod {
    public static void main(String[] args) {
        //print out numbers 1-100 but only odd
        oddNumber();
    }
    public static void oddNumber(){

        for(int i = 0; i<=100;i++){
        if(i%2!=0){
            System.out.println(i);
        }
    }
    }
}
