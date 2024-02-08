package week11;

import java.util.Map;

public class MinValue_BM {
    public static int MinValue(Map<String, Integer> map){

      int min = Integer.MAX_VALUE;

        for (int each : map.values()) {
            if (each < min) {
                min = each;
            }

        }

        return min;


    }

    public static void main(String[] args) {

        Map<String, Integer> taskMap = Map.of("A", 20,"B",15, "c",25,"F",22);

        int minimumNumber = MinValue(taskMap);

        System.out.println(minimumNumber);

    }

}
