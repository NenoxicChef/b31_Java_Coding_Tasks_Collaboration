package week3;

public class Question2_ZO {
    public static void main(String[] args) {
        System.out.println(reverseInt(-1234));
    }
    public static int reverseInt ( int n){
        int rev = 0;

        while (n<0){
            int lastNumber = n % 10;
            rev = rev * 10 + lastNumber;
            n /= 10;
        }
        return rev;
    }
}
