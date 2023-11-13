package week1;

public class Finra_MC {

    public static void main(String[] args) {


        String result="";

        for (int i = 0; i < 31; i++) {
            if(i%3==0){
                result+="FIN ";
            } else if (i%5 ==0) {
                result += "RA ";
            }else if (i % 15 ==0){
                result+="FINRA ";
            }else{
                result+= i+" ";
            }
        }

        System.out.println(result);
    }




}

