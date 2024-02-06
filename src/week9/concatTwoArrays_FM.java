package week9;

import java.util.Arrays;

public class concatTwoArrays_FM {

    public static void main(String[] args) {
        int [] arr1 = {1, 4, 5};
        int [] arr2 = {8, 12, 5, 9};

        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));

    }
    public static int[] concatArrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];

        for(int i = 0, y = 0; i < merged.length; i++){

            if(i < arr1.length){
                merged[i] = arr1[i];
            } else {
                merged[i] = arr2[y++];
            }

        }

        return merged;
    }

    /*
    1) Array - Concat two arrays
Write a return method that can concat two arrays
     */
}
