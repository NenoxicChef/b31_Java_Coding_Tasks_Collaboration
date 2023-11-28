package week2;

public class Question1_ZO {

    public static void main(String[] args) {
        String by3 = "";
        String by5 = "";
        String by15 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){
                by15 += i + " ";
            } else if (i % 5 == 0) {
                by5 += i + " ";
            } else if (i % 3 == 0) {
                by3 += i + " ";
            }
        }
        System.out.println("Devisible by 3: " + by3 );
        System.out.println("Devisible by 5: " + by5 );
        System.out.println("Devisible by 15: " + by15);
    }


}
