package week6;

public class ArrayFindMaxNum_GG {

    public static void main(String[] args) {

        int [] arr = {3,99,1,5,-1,5};

        System.out.println("Maximum number is = " + maxNum(arr));

    }


    public static int maxNum(int[] arr){
        int max = arr[0]; // i am initintializing default value for my arr

        for (int each : arr) {
            if (each>max){
                max=each;
            }

        }
        return max;
    }
}


/*
Write a method that can find the maximum number from an int Array
 */