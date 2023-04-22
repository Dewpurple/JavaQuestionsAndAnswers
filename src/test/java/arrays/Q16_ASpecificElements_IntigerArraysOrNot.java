package arrays;

public class Q16_ASpecificElements_IntigerArraysOrNot {
        /*
        a specific element exists in an array or not

         */
    public static void main(String[] args) {


        int c[] = {-12, 21, 34};
        int num = 21;

        int counter=0;
        for(int w:c) {
            if(w==num){
                System.out.println(w);
                counter++;
            }

        }

        if(counter>0){
            System.out.println("num is exist in Arrays");
        }else {
            System.out.println("Num does not exist in Arrays");
        }
    }

}
