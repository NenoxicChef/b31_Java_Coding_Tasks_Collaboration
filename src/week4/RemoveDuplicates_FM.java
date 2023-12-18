package week4;

public class RemoveDuplicates_FM {

    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String result = removeDup(str);
        System.out.println(result);
    }

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);


            if (result.indexOf(currentChar) ==-1) {
                result += currentChar;
            }
        }

        return result;
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
 */

