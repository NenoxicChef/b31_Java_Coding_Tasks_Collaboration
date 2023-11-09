package week1;

public class OddOrEven_BM {

    public static String oddOrEven(int x){
        if (x % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(15));
    }

}
