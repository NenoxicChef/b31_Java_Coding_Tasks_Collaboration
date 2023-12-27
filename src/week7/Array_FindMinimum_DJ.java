package week7;

/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */

public class Array_FindMinimum_DJ {



        public static void main(String[] args) {
            int[] numbers = {11, 17, 8, 20, 13}; // Initializing an array of integers
            int minNum = findMinNumber(numbers); // Calling the method I created findMinNumber and storing the result in minNum variable

            System.out.println("The minimum number is: " + minNum);
        }

        public static int findMinNumber(int[] array) {

            if (array.length == 0) {// Right here I'm checking that the array is not empty
                throw new IllegalArgumentException("Array is empty");//If it is then we need to throw this exception
            }

            // Assume the first element is the minimum
            int minNum = array[0];  // Right here we're going to initialize the variable minNum and assume the first element is the minimum


            for (int i = 1; i < array.length; i++) { // Iterate through the array to find the maximum number
                if (array[i] < minNum) { //If i is greater than maxNum then
                    minNum = array[i];
                }
            }


            return minNum;// Return the minimum number found
        }
    }



