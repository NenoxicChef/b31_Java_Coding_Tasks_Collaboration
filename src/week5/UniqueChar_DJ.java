package week5;

public class UniqueChar_DJ {



            public static void main(String[] args) {
                String characters = "AAABBBCCCDEF";
                String result = unique(characters);
                System.out.println(result);
            }

            public static String unique(String str) {
                String result = "";

                for (int i = 0; i < str.length(); i++) {
                    char currentChar = str.charAt(i);


                    if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                        result += currentChar;
                    }
                }

                return result;
            }
        }
        /*
                                    String -- Find the unique
                                    Write a return method that can find the unique characters from the String
                                    Ex: unique("AAABBBCCCDEF") ==> "DEF";

         */





