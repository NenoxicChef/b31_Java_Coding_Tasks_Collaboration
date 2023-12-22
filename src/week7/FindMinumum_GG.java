package week7;

public class FindMinumum_GG {

    public static void main(String[] args) {
        int[] arr ={55,65,-89,-87,36};
        System.out.println("Minumum Number Arr = " + minNum(arr));
    }

    public static int minNum(int[] arr){
        int min = arr[0];
        for (int each : arr) {
            if (each<min){
                min=each;
            }
        }
        return min;
    }
}

/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
