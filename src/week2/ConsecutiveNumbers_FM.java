package week2;

public class ConsecutiveNumbers_FM {

    public static void main(String[] args) {

        ConsecutiveNumbers(30);
    }

    public static void ConsecutiveNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }

            if (i % 3 == 0) {
                result += "Test";
            }

            if (i % 5 == 0) {
                result += "Coders";
            }

            // If not divisible by 2, 3, or 5, print the number itself
            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}
/*
Write a function that, give a positive integer N, prints the consecutive numbers from 1 to N,
each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the
word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers
2, 3 and 5 it should be replaced by a concatenation of the respective words Cordiality,
Test and Coders in this given order. for example, numbers divisible by both 2 and 3 should be
replaced by CodilityTest and numbers divisible by all three numbers 2, 3, and 5 should be replaced
by CodilityTestCoders
 */

