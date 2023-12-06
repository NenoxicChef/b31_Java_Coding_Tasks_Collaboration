package week4;

public class FrequencyOfCharacters_BM {
    public static String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars1("AAAAABBBBBBCCCCCCDDDDDDD"));
    }
}
