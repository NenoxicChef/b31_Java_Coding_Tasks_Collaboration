package week6;

public class SumOfDigits_MC {

    public static void main(String[] args) {


        String str = "1h482gdtaFR";
        int sum = sumOfDigits(str);
        System.out.println("Sum of digits: "+ sum);

    }
    public static int sumOfDigits(String str){

        int sum =0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <='9'){
                sum+= ch - '0';
            }
        }

        return sum;

    }


}
/*
Write a method that can
return the sum of the digits in a string
 */