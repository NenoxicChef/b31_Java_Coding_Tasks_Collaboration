package week5;

public class Reverse_GG {

    public static void main(String[] args) {

        System.out.println("Reverse palindrome words : " + reverse("kayak, level , madam"));

    }
    public static String reverse (String str){

        String reverse = "";
        for (int i = str.length() -1; i >=0 ; i--) {
            reverse+= str.charAt(i);
        }
        return reverse;
    }
}

