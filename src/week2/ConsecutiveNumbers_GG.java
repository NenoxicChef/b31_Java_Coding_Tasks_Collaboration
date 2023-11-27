package week2;

public class ConsecutiveNumbers_GG {
    public static void main(String[] args) {
        System.out.println(devisibleNumbers(30));
    }
    public static int devisibleNumbers(int n){
        for (int i = 1; i <= n; i++) {
            if  (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");
            }else if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodibilityTest");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodibilityCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codibility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }

        return n;
    }

}
