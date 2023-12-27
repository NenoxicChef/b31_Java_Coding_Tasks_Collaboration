package week5;

public class UniqueChars_FM {

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String unique = findUniqueCharacters(str);
        System.out.println("Unique characters: " + unique);
    }

    public static String findUniqueCharacters(String input) {
        String unique = "";

        for (int i = 0; i < input.length(); i++) {
            char each = input.charAt(i);

            if (input.indexOf(each) == input.lastIndexOf(each)) {
                unique += each;
            }
        }

        return unique;
    }
}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */
