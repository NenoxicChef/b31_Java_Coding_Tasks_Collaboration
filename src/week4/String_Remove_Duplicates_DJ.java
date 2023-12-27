package week4;

public class String_Remove_Duplicates_DJ {

    public static void main(String[] args) {

        /*
        String Remove Duplicates
        Write a return method that can remove the duplicated values from
        String
        Ex:
        removeDup (" AAABBBCCC")==> ABC
         */

        String str = "AAABBBCCC";


        String result = "";   //"efr"

        for (int i = 0; i < str.length(); i++) { //i: index numbers of str

            char each = str.charAt(i);   // each character of the String str

            if( ! result.contains( ""+ each)  ){ // if the string result does not contain the character of string str yet
                result += each; // then we will add the character to string result
            }
            // if the character is not contained yet in the new string, then we will add it to the new string

        }


        System.out.println(result);


    }



}
