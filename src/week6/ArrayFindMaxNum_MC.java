package week6;

public class ArrayFindMaxNum_MC {

    public static void main(String[] args) {


        int[] numbers = {1,4,80,45,66};
        int max = maxNumArray(numbers);
        System.out.println("Maximum number is "+max);



    }

    public static int maxNumArray(int[] arr){



        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max= arr[i];
            }
        }

        return max;
    }
}
/*
Write a method that can find the maximum number
from an int Array
 */