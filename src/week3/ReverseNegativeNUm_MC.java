package week3;

public class ReverseNegativeNUm_MC {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-23));


    }


    public static int reverseNegative(int num){

        if(num < 0){
            return -num;
        }else{
            return num;
        }

    }
}
/*
write a return method that can reverse negative number and return it as int
 */






