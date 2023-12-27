package week7;

public class ArrayFindMinimum_FM {

    public static int findMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 23, 6, 78, 4};
        int min = findMinimum(arr);
        System.out.println("Minimum: " + min);
    }
}
/*
Write a method that can find the maximum number from an int Array
 */

