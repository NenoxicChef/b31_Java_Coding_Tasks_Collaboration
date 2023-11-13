package week1;

public class NoDivideOperator_DJ {

        public static int noDivide(int x, int y){
            int result = 0;

            while (x >= y){
                x = x - y;
                result++;
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(noDivide(20, 10));
        }

    }






