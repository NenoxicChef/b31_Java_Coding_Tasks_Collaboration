package week1;

public class NoDivision_BM {
    public static int noDivision(int x, int y){
        int result = 0;

        while (x >= y){
            x = x - y;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(noDivision(10, 5));
    }

}
