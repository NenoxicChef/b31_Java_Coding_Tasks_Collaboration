package week11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_FM {

    public static Map<String, Integer> frequencyOfCharacters(String str) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            map.put(each, frequency);
        }

        return map;
    }

    public static void main(String[] args) {
        String str = "bbcccaaaaa";
        Map<String, Integer> characterFrequency = frequencyOfCharacters(str);
        System.out.println(characterFrequency);
    }

}
/*
Map-- Frequency of Characters
Write a method that prints the frequency of each character from a String.
 */