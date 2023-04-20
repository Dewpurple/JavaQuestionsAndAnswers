package ternarystatement;

public class Q07_EvenorOdd {

    /*
    Print 'Even' for even integers, print ‘Odd’ for odd integers by using ternary
     */
    public static void main(String[] args) {
        getNumbersEvenOrOdd(128);
    }


    public static int getNumbersEvenOrOdd(int num){
        String evenOrOddNum= num%2==0    ?    "The number is even"   : "The number is odd";
        System.out.println("evenOrOddNum = " + evenOrOddNum);
        return num;
    }
}
