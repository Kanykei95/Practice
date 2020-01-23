package Strings;

public class AnotherOlgaPracticelastIndexOf {
    public static void main(String[] args) {

        String str = "Niagara  o roar again!";

        int last_index_of_r = str.lastIndexOf("r");
        int last_index_of_i= str.lastIndexOf("i");

        System.out.println("last index of " + last_index_of_r);
        System.out.println("last index of " + last_index_of_i);
        int second_from_the_end_r = str.lastIndexOf("r ", last_index_of_r-1);
        int second_from_the_end_i= str.lastIndexOf("i ", last_index_of_i-1);
        System.out.println("second i from the end " + second_from_the_end_i);

    }
}
