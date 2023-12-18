package week2;

public class SwapTwoNumbers_FM {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping:\n a = " + a + "\n b = " + b);

        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:\n a = " + a + "\n b = " + b);

    }
}
/*
Swap two variable values without using a third variable
 */

