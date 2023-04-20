package ternarystatement;

public class Q03_LeapYear {
    /*
    Type Apex code by using nested ternary.
    Write a program to check if a year is a leap year or not.
    If the year is divisible by 100 then it must be divisible by 400.
    If a year is not divisible by 100 then it must be divisible by 4.
     */
    public static void main(String[] args) {
        getLeapYear(2021);
    }

    public static int getLeapYear(int year){

        String leapYear =year%100==0  ?
                         year%400==0 ?   "Leap Year" : " Not Leap Year " :
                         year%4==0 ? "Leap Year" :  "Not Leap Year";
        System.out.println("leapYear = " + leapYear);

        return year;
    }
}
