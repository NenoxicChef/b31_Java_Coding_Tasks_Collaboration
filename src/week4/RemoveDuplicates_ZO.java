package week4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_ZO {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDup(3,3,4,5,6,1,1,1,2,2,2,3,8,9,7,5,4,4)));
    }
    public static int[] removeDup(int... arr){
        Set<Integer> unique = new HashSet<>();
        for (int each : arr){
            unique.add(each);
        }
        int[] uniqueARR = new int[unique.size()];
        int index = 0;

        for (int each : unique){
            uniqueARR[index++] = each;
        }
        return  uniqueARR;
    }
}
