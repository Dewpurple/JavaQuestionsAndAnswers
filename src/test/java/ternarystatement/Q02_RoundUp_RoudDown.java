package ternarystatement;

public class Q02_RoundUp_RoudDown {

    /*
    Use ternary to print
    a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater
    than or equal to 5
    b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
    than 5
    For example; 127 will be rounded up and the value will be 130
    125 will be rounded up and the value will be 130
    123 will be rounded down and the value will be 120
         */
    public static void main(String[] args) {

       getRoundingUnit(127);
    }

    public static int getRoundingUnit(int num){

        int roundingUnitRules =num%10>=5 ?  ((num/10)*10) +10              :   ((num/10)*10 )       ;
        System.out.println("roundingUnitRules = " + roundingUnitRules);

        return num;
    }
}
