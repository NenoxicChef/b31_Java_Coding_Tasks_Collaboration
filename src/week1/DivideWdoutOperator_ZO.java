package week1;

public class DivideWdoutOperator_ZO {

    public static void main(String[] args) {
        System.out.println(dWO(20, 5));
    }

    public static int dWO(int x, int y){
        int result= 0;

        while (x>= y){
            x = x-y;
            result++;
        }
        return result;
    }


}
