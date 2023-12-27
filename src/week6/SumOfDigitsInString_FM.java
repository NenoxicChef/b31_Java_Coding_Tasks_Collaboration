package week6;

public class SumOfDigitsInString_FM {

    public static void main(String[] args) {
        String str = "A1B2C365hj";
        int sum = SumOfDigits(str);
        System.out.println("sum = " + sum);
    }

    public static int SumOfDigits(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }

        return sum;
    }
}
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */

