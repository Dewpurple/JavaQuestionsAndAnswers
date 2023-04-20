package ternarystatement;

public class Q04_AbsoluteValue {
    /*
    Type code to calculate the absolute value of a number
    For positive numbers and zero absolute value is the same with the number
    For negative numbers to find absolute value multiply the number by -1
     */
    public static void main(String[] args) {
        getAbsoluteValuewithMath(-5);
        getAbsoluteValueWithNested(-8);
    }


    public static int getAbsoluteValuewithMath(int num){

        int abs=Math.abs(num);
        System.out.println("abs = " + abs);
        return num;
    }

    public static int getAbsoluteValueWithNested(int num){

        int abs= num>0   ? num   : -1*num;
        System.out.println("abs = " + abs);
        return num;
    }
}
