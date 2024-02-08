package week11;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters_BM {

    public static void Frequency(String  str ) {

        Map<Character, Integer> frequencyCharacters = new HashMap<>();

        for (Character each : str.toCharArray()) {

            if (frequencyCharacters.containsKey(each)) {
                frequencyCharacters.put(each, frequencyCharacters.get(each) + 1);
            } else {
                frequencyCharacters.put(each, 1);
            }
        }
        System.out.println(frequencyCharacters);
    }

    public static void main(String[] args) {
        Frequency("aaaaabbbbbbcccccc");


    }

}
