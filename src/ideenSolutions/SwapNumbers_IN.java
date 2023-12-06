package ideenSolutions;

public class SwapNumbers_IN {
    public void swap1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
