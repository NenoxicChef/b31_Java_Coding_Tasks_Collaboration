package week11;

import java.util.Map;

public class MinValue_FM {

    public static int MinValue(Map<String, Integer> map) {
        // Initialize min with the maximum possible integer value
        int min = Integer.MAX_VALUE;

        // Iterate over the values of the map
        for (int value : map.values()) {
            // Update min if the current value is less than min
            if (value < min) {
                min = value;
            }
        }

        // Return the minimum value
        return min;
    }

    public static void main(String[] args) {
        // Sample map
        Map<String, Integer> sampleMap = Map.of("A", 10, "B", 5, "C", 20, "D", 2);

        // Get the minimum value from the map
        int minValue = MinValue(sampleMap);

        // Print the minimum value
        System.out.println("Minimum value: " + minValue);

    }

/*
Map - Min value
Write a method that can return the minimum value from a map (DO NOT
use sort method).
 */
}
