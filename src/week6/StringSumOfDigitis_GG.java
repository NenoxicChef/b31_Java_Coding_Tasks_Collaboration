package week6;



public class StringSumOfDigitis_GG {
    public static void main(String[] args) {
        System.out.println("sumof = " + sumof("achjhasgd897sd"));
    }

    public static String sumof(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }

        // Convert the sum to a string before returning
        return Integer.toString(sum);
    }
}


/*
Write a program that can return the sum of digits from a  string

 */