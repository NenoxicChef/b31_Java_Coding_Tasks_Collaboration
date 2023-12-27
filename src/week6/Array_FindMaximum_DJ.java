package week6;

public class Array_FindMaximum_DJ {


        public static void main(String[] args) {
            int[] num = {10, 52, 82, 20, 105}; // Initializing an array of integers
            int maxNum = findMaxNumber(num); // Calling the method I created findMaxNumber and storing the result in maxNum variable

            System.out.println("The maximum number is: " + maxNum);
        }

        public static int findMaxNumber(int[] array) {

            if (array.length == 0) {// Right here I'm checking that the array is not empty
                throw new IllegalArgumentException("Array is empty");//If it is then we need to throw this exception
            }

            int maxNum = array[0]; // Right here we're going to initialize the variable maxNum and assume the first element is the maximum

            for (int i = 1; i < array.length; i++) {// Iterate through the array to find the maximum number
                if (array[i] > maxNum) { // If i is greater than maxNum then
                    maxNum = array[i]; // maxNum = i
                }
            }

            return maxNum; // Return the maximum number found
        }
    }




