package week7;

import java.util.Arrays;

public class ArraySortAscending_FM {

    public static void SortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for(int j=0; j<arr.length; j++){
                int temp=0;
                if (arr[i]>arr[j]){ // for sorting in descending order we will change  ‘<’ to ‘>’ .
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {9, 4, 23, 6, 78, 4};
        SortAscending(arr);
    }
}
/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
 arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */

