package week5;

public class ReverseString_DJ {

    public static void main(String[] args) {

        System.out.println("Reverse String: " + reverse("OUR GROUP IS THE BEST!"));
    }

    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}

