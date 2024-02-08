package week9;

import java.util.Arrays;

public class concatTwoArrays_BM {


    public static int[] concatArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }


    public static void main(String[] args) {

        int[] arr1 = {1,3,4,5};
        int[] arr2 = {6,7,8,9};
        System.out.println(Arrays.toString(concatArrays(arr1,arr2)));

    }
}
