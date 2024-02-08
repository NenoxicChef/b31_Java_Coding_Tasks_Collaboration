package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Move_Zeros_To_The_End_BM {


    public static List<Integer> zerosMovedToEnd(List<Integer> list) {
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> numbersWithZeros = new ArrayList<>(Arrays.asList(0,0,0,1,3,0,81,0,77));
        System.out.println(zerosMovedToEnd(numbersWithZeros));


    }


}
