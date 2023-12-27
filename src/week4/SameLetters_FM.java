package week4;

import java.util.Arrays;

public class SameLetters_FM {

    public static void main(String[] args) {

        System.out.println(same("abc", "cab"));
        System.out.println(same("abc", "abb"));  // Output: false
        //same(String str1, String str2);
    }

    // Method to check if two strings are built out of the same letters
    public static boolean same(String str1, String str2) {
        // Check if the lengths of the strings are different
        if (str1.length() != str2.length()) {
            return false;

        }

        // Convert strings to char arrays for easy comparison
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;

            }
        }

        // If all characters match, the strings are built out of the same letters
        return true;

    }

}
/*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:

 */

