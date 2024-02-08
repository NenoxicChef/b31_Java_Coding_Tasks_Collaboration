package week10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByValues {

    public static Map<String, Integer> sortedValue(Map<String, Integer> sortedValue) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(sortedValue.entrySet());
        list.sort(Map.Entry.comparingByValue());

        sortedValue = new HashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            sortedValue.put(each.getKey(), each.getValue());
        }

        return sortedValue;
    }

    public static void main(String[] args) {

        Map<String , Integer> sampleTask = Map.of("a",22, "b",89, "c",88, "d",21);

        System.out.println(sortedValue(sampleTask));
    }

}
