package week10;

import java.util.Arrays;

public class SortArrayListAscending_BM {
    public static int[] sortDesc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
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
        int[] sortedArray = sortDesc(arrayToSort);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }


    }
}
