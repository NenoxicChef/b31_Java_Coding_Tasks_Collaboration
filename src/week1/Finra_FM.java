package week1;

public class Finra_FM {
    public static void main(String[] args) {
        printFINRA();

    }
    public static void printFINRA(){
        for (int i = 1; i < 30; i++) {

            if(i % 15 == 0){
                System.out.print("FINRA ");
            }else if(i % 3 == 0){
                System.out.print("FIN ");
            }else if(i % 5 == 0){
                System.out.print("RA ");
            }else{
                System.out.println(i);
            }

        }
    }
}
