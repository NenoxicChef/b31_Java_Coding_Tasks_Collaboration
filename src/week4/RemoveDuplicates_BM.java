package week4;

public class RemoveDuplicates_BM {
    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAAAABBBBBBBCCCCCDDDDDEEEEEFFFFFFFF"));
    }
}
