package week3;

public class ReverseNegativeNum {

    public static void main(String[] args) {
        int negativeNumber = -702;
        int reversedNumber = reverseNegative(negativeNumber);
        System.out.println("Original number: " + negativeNumber);
        System.out.println("Reversed number: " + reversedNumber);
    }

    static int reverseNegative(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}




