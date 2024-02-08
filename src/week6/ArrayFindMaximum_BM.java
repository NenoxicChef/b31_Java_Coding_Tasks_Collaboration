package week6;

public class ArrayFindMaximum_BM {

    public static int maxDigit(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] taskNums = {1,33,88,1222,18181};
        System.out.println(maxDigit(taskNums));
    }
}
