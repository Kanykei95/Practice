package ReplIt;

import java.util.Arrays;

public class kakakakakkakakakaka {
    public static void main(String[] args) {

        int[] a = {3, 6, 0, 4, 3, 2, 7, 1};
        zombieApocalypse(a);

    }

    public static void zombieApocalypse(int[] array) {

        boolean keepGoing = true;

        int j = 1;
        while (keepGoing) {

            int[] arrayCopy = array;

            //first element
            if (array[0] == 0) {
                arrayCopy[1] = array[1] / 2;
            }

            //element in the middle
            for (int i = 1; i < array.length - 1; i++) {

                if (array[i] == 0) {
                    arrayCopy[i - 1] = array[i - 1] / 2;
                    arrayCopy[i + 1] = array[i + 1] / 2;
                }

            }
            //last element
            if (array[array.length - 1] == 0) {
                arrayCopy[array.length - 1] = array[array.length - 1] / 2;
            }

            System.out.println("Day " + j);
            //copies clone back to original array
            array = arrayCopy;
            System.out.println(Arrays.toString(array));

            j++;

            int counter = 0;
            //for each element checking if every city is zero
            for (int element : array) {
                counter = counter + element;
            }

            //if each element value in every city is zero, we stop
            if (counter == 0) {
                keepGoing = false;
            }
        }
    }
}