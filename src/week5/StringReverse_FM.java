package week5;

public class StringReverse_FM {

    public static void main(String[] args) {

        String str = "ABCD";
        String result = reverse(str);
        System.out.println(result);

    }


    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}

/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
