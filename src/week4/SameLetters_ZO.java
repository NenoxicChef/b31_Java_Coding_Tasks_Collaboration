package week4;

import java.util.HashMap;
import java.util.Map;



public class SameLetters_ZO {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ollhe";

        if (areSameLetters(str1, str2)) {
            System.out.println(" The strings have the same letters.");
        }else {
            System.out.println("The strings do not have the same letters.");
        }
        }
    public static boolean areSameLetters(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char c : str1.toCharArray()){
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c,0));
        }
        for (char c : str2.toCharArray()){
            int frequency = charFrequencyMap.getOrDefault(c,0);
            if (frequency == 0){
                return false;
            }
            charFrequencyMap.put(c,frequency-1);
        }
        for (int frequency : charFrequencyMap.values()){
            if (frequency != 0 ){
                return false;
            }
        }
        return true;
    }
    }

