package week6;

import java.util.Arrays;

public class StringSumOfDigits_BM {
    public static int theSumOfNums(String s) {

        int sum = 0;

        String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");

        for(String each : numbers){
            sum+=Integer.parseInt(each);
        }

        return sum;
    }

    public static void main(String[] args) {
        String taskThing = "ben 12 egg 1 cheese";
        System.out.println(theSumOfNums(taskThing));

    }
}
