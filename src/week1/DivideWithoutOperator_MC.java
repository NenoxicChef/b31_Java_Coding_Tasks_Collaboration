package week1;

public class DivideWithoutOperator_MC {

    public static void main(String[] args) {

        int a= 30;
        int b= 5;

        int count =0;

        while(a>=b){
            a-=b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);





    }

}
