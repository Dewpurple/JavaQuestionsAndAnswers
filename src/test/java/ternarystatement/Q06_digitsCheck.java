package ternarystatement;

public class Q06_digitsCheck {

    /*
    If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the
    output will be “This number has no 3 digits.”
     */
    public static void main(String[] args) {
        getDigitsCheck(-978);
    }


    public static int getDigitsCheck(int a){

        String digitsOfNum =
                a>99 && a<1000      ?   "The number has  3 digits"
                        : a<-99 && a>-1000 ?  "The number has 3 digits" :  "The number does not have 3 digits";
        System.out.println("digitsOfNum = " + digitsOfNum);
        return a;
    }
}
