package week10;

import java.util.Arrays;

public class SortArrayListDescending_BM {
    public static int[] sortAsc(int[] array) {

        int[] result = Arrays.copyOfRange(array, 0, array.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }

        }

        return result;

    }


    public static void main(String[] args) {

        int[] arrayToSort = {5, 3, 8, 1, 2};
        int[] sortedArray = sortAsc(arrayToSort);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }


    }

}
