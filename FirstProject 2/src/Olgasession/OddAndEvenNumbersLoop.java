package Olgasession;

public class OddAndEvenNumbersLoop {
    public static void main(String[] args) {
        int count_even = 0;
        int count_odd=0;
        for(int i=1; i<=30; i++){
            if(i%2==0){
                System.out.println("evern is " +i);
                count_even++;
            }else{
                System.out.println("odd is " + i);
                count_odd++;
            }
        }
        System.out.println("You have " + count_even+" even numbers");
        System.out.println("You have "+ count_odd+ " odd numbers");
    }
}
