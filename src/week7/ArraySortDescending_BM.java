package week7;

import java.util.Arrays;

public class ArraySortDescending_BM {

    public static int[] sortDesc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

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
            int[] taskNumbers = {22,34,26,75,11,9};
            System.out.println(Arrays.toString(sortDesc(taskNumbers)));

        }

}
