package week1;

public class OddOrEven_FM {
    public static void main(String[] args) {
        System.out.println(oddOrEven(7));

    }
    public static String oddOrEven(int number){
        return (number % 2 == 0) ? "Even" : "Odd";

    }
}
