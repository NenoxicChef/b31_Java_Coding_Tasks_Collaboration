package week1;

public class DivisionWithoutOperator_FM {
    public static void main(String[] args) {
        System.out.println(DivisionWithoutOperator(20, 5));

    }

    public static int DivisionWithoutOperator(int x, int y){
        if(x < y){
            return 0;
        }else{
            return 1 + DivisionWithoutOperator(x - y, y);
        }

    }
}
