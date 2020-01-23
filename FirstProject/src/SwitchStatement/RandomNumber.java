package SwitchStatement;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int number = random.nextInt(100);

        System.out.println(number);


    }
}
