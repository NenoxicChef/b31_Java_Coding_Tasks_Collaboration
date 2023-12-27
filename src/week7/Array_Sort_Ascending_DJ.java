package week7;

import java.util.Arrays;

/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
 */
public class Array_Sort_Ascending_DJ {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending(12, 2, 6, 3, 94, -2, 11, 45)));
        //This will print the sorted numbers in ascending order by calling the sortAscending method that I created
    }

    public static int[] sortAscending(int... arr) { // right here I declared a static method that will take integer arguments and return
        //an array of integers that are the sorted result

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) { // Iterating through the array multiple times comparing the elements
                //and swapping them to put them in the correct order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        return arr;
    }

}

