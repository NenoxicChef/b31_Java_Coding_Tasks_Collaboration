package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeAhmed_FM {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Sam", "Jane"));
        System.out.println(removeAhmed(names));

    }

    public static List<String> removeAhmed(List<String> names){
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            if(iterator.next().equals("Ahmed")){
                iterator.remove();
            }
        }
        return names;
    }
    /*
    2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
     */
}
