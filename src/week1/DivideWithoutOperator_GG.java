package week1;

public class DivideWithoutOperator_GG {
    public static int divisionWithoutOperator(int a, int b) {

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        return count;
    }
            public static void main(String[] args) {
                System.out.println(divisionWithoutOperator(678, 56));


            }

}
