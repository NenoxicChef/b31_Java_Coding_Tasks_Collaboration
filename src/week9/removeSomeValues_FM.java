package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeSomeValues_FM {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10000, 50, 24, 124, 29, -255, 981, 102, 87, 99, 1000));
        System.out.println(removeMoreThan100(nums));

    }

    public static List<Integer> removeMoreThan100(List<Integer> nums){

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            if(it.next() > 100){
                it.remove();
            }
        }
        return nums;
    }

    /*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
}
