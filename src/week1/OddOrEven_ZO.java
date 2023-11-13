package week1;

public class OddOrEven_ZO {
    public static boolean OddorEven(int num){
        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }

    }


    public static void main(String[] args) {

    int num = 5;
    if (OddorEven(num)==true){
        System.out.println("Even");
    }else {
        System.out.println("Odd");
    }

    }
}
