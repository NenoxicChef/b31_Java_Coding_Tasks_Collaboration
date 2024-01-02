package week8;

import java.util.Arrays;

public class Array_N_Unique_Int_That_Sum_up_to_0_DJ {

        public static int[] uniqueArray(int N) { //I created a static method that has an int parameter that will return an array of integers
            if (N <= 1 || N >= 100) { //if statement to check if the value of N is less than or equal to 1 OR greater than or equal to 100
                throw new IllegalArgumentException("N should be between 1 and 99(exclusive).");//if the condition is true then the exception will be thrown
            }

            int[] result = new int[N];//created a new array named result with a value of N that will store unique integers

            for (int i = 0; i < N - 1; i++) {//created a for loop where I has the value of 0, and will continue executing as long as I is less
                //than N - 1, and will be incremented by 1 during each iteration of the loop
                int randomNum = (int) (Math.random() * 200 - 100);//each iteration generates random numbers between -100 and 100(exclusive)
                result[i] = randomNum; //This assigns randomNum to the element I in the result
            }

            // Calculate the last element to make the sum zero
            int sum = Arrays.stream(result).sum(); //here we're going to just calculate the sum of all the elements in result
            result[N - 1] = -sum; //we modify the last element of the array to be the negation of the sum of all the elements.

            return result;
        }

        public static void main(String[] args) {
            int N = 4;
            int[] result = uniqueArray(N);

            System.out.println("Generated array for N=" + N + ": " + Arrays.toString(result));
        }
    }




