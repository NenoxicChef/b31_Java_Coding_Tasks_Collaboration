package week7;

import java.util.Map;

public class ArrayFindMinimum_BM {
    public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }
    public static void main(String[] args) {


        int[] minimumNumber = {1,5,6,8,12,22};

        System.out.println(minValue(minimumNumber));

    }

}
