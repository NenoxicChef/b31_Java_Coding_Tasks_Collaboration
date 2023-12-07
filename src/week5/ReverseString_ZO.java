package week5;

public class ReverseString_ZO {

    public static void main(String[] args) {
        String example = "ABCD";

        char[] arr = example.toCharArray();
        int j = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        String reversed = new String(arr);

        System.out.println(example);  // ABCD
        System.out.println(reversed); // DCBA
    }
}
