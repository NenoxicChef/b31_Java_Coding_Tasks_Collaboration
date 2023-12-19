package week5;



public class Unique_GG {
    public static void main(String[] args) {

        System.out.println("unique: " + unique ("YYYYSSSDDDDDGCCCCÖLLLLLKVVVVVHXXXXXXAPPPPPPPN"));
    }

    public static String unique (String str){


        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }


        return unique;

    }
}
