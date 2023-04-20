package ternarystatement;

public class Q08_PositiveNegative {

    public static void main(String[] args) {
        getPositiveOrNegative(0);
    }



    public static int getPositiveOrNegative(int num){

       String number=  num!=0   ?  num>0   ? "Number is positive" : "Number is negative" : "Num is zero";
       System.out.println("number = " + number);
       return num;


    }
}
