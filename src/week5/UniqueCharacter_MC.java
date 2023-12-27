package week5;

public class UniqueCharacter_MC {

    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDEF"));


    }



    public static String uniqueChar (String str){


        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if ((str.indexOf(each))==str.lastIndexOf(each)){
                unique+=each;
            }
        }


        return unique;

    }
}
/*
String -- Find the unique
Write a return method that can find the
unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */