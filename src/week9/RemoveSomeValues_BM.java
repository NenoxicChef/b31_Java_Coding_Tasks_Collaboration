package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues_BM {


    public static List<Integer> removeOver100(List<Integer> list){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }

        return list;
    }

    public static void main(String[] args) {

        List<Integer> numbersArray = new ArrayList<>(Arrays.asList(1200, 89, 74, 224, 129, -2, 1921, 1112, 77, 45, 10000));
        System.out.println(removeOver100(numbersArray));

    }


}
