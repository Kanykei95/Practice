package Methods;

public class MultipleReturn {





    public static int checkNumber (int num){

        if(num<0){
            return 0;
        }else {
            return num + 1;
        }
    }
    public static void main(String[] args){
        System.out.println(checkNumber(-4));
        System.out.println("Positive numer: " + checkNumber(4));
    }
}
