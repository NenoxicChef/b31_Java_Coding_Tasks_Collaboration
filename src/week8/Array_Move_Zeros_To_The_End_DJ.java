package week8;

import java.util.Arrays;

public class Array_Move_Zeros_To_The_End_DJ {



        public static void moveZerosToEnd(int[] array) { //a static method with int array as a parameter
            int nonZeroIndex = 0;// this int variable will control where the nonzero elements will be placed

            // Traverse the array and move non-zero elements to the front
            for (int i = 0; i < array.length; i++) { //in this for loop we'll iterate through the array and
                if (array[i] != 0) { //the nonzero elements are moved to the front of the array, if I is not equal to 0
                    array[nonZeroIndex] = array[i];
                    nonZeroIndex++;
                }
            }

            // Fill the remaining indexes with zeros
            while (nonZeroIndex < array.length) { // in the while loop the remaining indexes is where the zeros will be placed
                array[nonZeroIndex] = 0;
                nonZeroIndex++;
            }
        }

        public static void main(String[] args) {
            int[] inputArray = {1, 0, 2, 0, 3, 0, 4, 0};

            System.out.println("Input Array: " + Arrays.toString(inputArray));

            moveZerosToEnd(inputArray);

            System.out.println("Output Array: " + Arrays.toString(inputArray));
        }
    }



