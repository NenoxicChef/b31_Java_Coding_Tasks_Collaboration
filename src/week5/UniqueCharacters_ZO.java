package week5;

public class UniqueCharacters_ZO {
    public static void main(String[] args) {
        String str = "aabccdeee";
        String uniques = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                uniques += ch;
            }
        }
        System.out.println(uniques);
    }
    }


