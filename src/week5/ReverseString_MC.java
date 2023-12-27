package week5;

public class ReverseString_MC {

    public static void main(String[] args) {


        System.out.println(reverseString("ABCD"));




    }

public static String reverseString(String str){

    String reverse = "";

    for (int i = str.length()-1; i>=0; i--){

        reverse+= str.charAt(i);
    }

    return reverse;


}
}
/*

String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */