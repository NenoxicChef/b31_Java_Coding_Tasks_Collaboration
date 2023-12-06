package week5;

public class Unique_BM {
    public static String unique(String word) {
        String[] arr = word.split("");
        String unique = "";

        for (int j = 0; j < arr.length; j++) {
            int number = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    number++;
                }
            }
            if (number == 1) {
                unique += arr[j];
            }
        }

        return unique;
    }
}
