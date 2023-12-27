package week3;

public class PrimeNumber_FM {

    public static void main(String[] args) {

        int num = 20;
        boolean isPrime = primeNumber(num);
        System.out.println("isPrime = " + isPrime);
    }

    public static boolean primeNumber(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */

