package week8;

import java.util.Arrays;

public class Array_N_Unique_Int_That_Sum_up_to_0_BM {
    public static int[] sumUpToZero(int N) {

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero(5)));
    }


}
