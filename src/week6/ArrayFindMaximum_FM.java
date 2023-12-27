package week6;

public class ArrayFindMaximum_FM {

    public static void main(String[] args) {
        int[] numbers = {100, 20, 500, 40, -10, 30};
        int max = findMaxNumber(numbers);
        System.out.println("The maximum number is: " + max);
    }

    public static int findMaxNumber(int[] array){

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */

