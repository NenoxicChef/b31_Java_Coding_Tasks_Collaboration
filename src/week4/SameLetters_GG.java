package week4;

public class SameLetters_GG {
    public static boolean areSameLetters(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        // Check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Check if each character in str1 has a corresponding match in str2
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str1.indexOf(ch) != str2.indexOf(ch)) {
                return false;
            }
        }

        // If all characters have the same count, the strings are made up of the same letters
        return true;
    }

    public static void main(String[] args) {

        boolean result1 = areSameLetters(" abc ", "cab");
        System.out.println(result1); // Output: true

        boolean result2 = areSameLetters("abc", "abb");
        System.out.println(result2); // Output: false
    }
}

/*

String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("
abc abb "); -->

 */