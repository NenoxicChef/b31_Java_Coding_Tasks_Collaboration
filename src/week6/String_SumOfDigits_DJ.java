package week6;

public class String_SumOfDigits_DJ {

    public static void main(String[] args) {
        String str = "d3a5j7u1a8n4"; // declaring a string variable named str & initialized with the value "d3a5j7u1a8n4"
        int sum = SumOfDigits(str); // declaring an int variable named sum and calling the method SumOfDigits
        System.out.println("sum = " + sum);
    }

    public static int SumOfDigits(String str) { // created a static method with a string parameter
        int sum = 0; // declared an int variable named sum and initialized it to zero

        for (int i = 0; i < str.length(); i++) {//iterating each character in the string "d3a5j7u1a8n4"
            char ch = str.charAt(i);//this part of the loop retrieves the character at the current index & assigns it to the variable 'ch'
            if (ch >= '0' && ch <= '9') {//checking if the current character is a digit with values '0' & '9' from the ASCII table
                sum += ch - '0'; //if it's a digit the value will be added to the variable sum
            }
        }

        return sum;
    }
}
