package week1;

public class OddOrEven {

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(9675321);
    }
}
