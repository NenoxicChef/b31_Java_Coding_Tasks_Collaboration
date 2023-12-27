package week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters_ZO {
    public static void main(String[] args) {
        freq("Banana apple pie");
    }
    public static void freq(String str){
        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if (!counter.containsKey(eachChar)){
                counter.put(eachChar, 1);
            }

            counter.put(eachChar, counter.get(eachChar) +1);
        }
        System.out.println(counter);
    }
}
