package week4;

public class FrequencyOfCharacters_FM {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        String result =  frequencyOfCharacters(str);
        System.out.println(result);
    }

    public static String frequencyOfCharacters(String str) {
        String result = "";

        for (int k = 0; k < str.length(); k++) {
            char ch = str.charAt(k);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }
            }

            if (!result.contains("" + ch)) {
                result += ch;
                result += count;
            }
        }

        return result;
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

