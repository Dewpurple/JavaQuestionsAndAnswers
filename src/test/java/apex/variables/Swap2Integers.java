package apex.variables;

import java.util.Scanner;

public class Swap2Integers {

    /*
    Ask user 2 numbers and type a code to swap two integers.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        double num1=(int) input.nextDouble();
        System.out.println("Please enter a number");
        double num2=(int) input.nextDouble();

       swapWithEmptyContainer(num1, num2);


        swapWithMath(num1, num2);


    }

    public static void swapWithMath(double num1, double num2) {
        num1 = num1 + num2;// num1:9=num1:3+num2:6;
        num2 = num1 - num2;//num2=3
        num1 = num1 - num2;//num1=6

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void swapWithEmptyContainer(double num1, double num2) {
        double num3=0;
        num3= num1;
        num1 = num2;
        num2 =num3;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }



}
