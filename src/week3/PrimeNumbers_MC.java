package week3;

public class PrimeNumbers_MC {

    public static void main(String[] args) {


        System.out.println(isPrime(23));
    }



    public static boolean isPrime(int num){

        for (int i =2; i< num; i++){
            if (num % i == 0 ){
                return false;
            }
        }

        return true;

    }
}
