package week3;

public class ReverseNegativeNum_FM {

    public static void main(String[] args) {
        System.out.println(reverseNum(-1532));
    }
    public static int reverseNum(int number){
        if(number<1 && number >= 0){
            return number;
        }

        int result = 0;
        while (number !=0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }
}
/*
2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
 */

