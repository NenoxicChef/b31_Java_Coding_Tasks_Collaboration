package week3;

public class Question1_ZO {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
    public static boolean isPrime (int num){

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
