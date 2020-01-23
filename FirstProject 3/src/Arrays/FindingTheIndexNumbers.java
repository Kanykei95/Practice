package Arrays;

import java.util.Arrays;

public class FindingTheIndexNumbers {
    public static void main(String[] args) {
        int [] nums = {45, 6, -3, 66};
        Arrays.sort(nums);
        System.out.println("Index of -3 " + Arrays.binarySearch(nums,-3));
    }
}
