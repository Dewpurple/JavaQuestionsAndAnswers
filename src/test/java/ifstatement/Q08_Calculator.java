package ifstatement;

import java.util.Scanner;

public class Q08_Calculator {
    /*
        Type code to create a simple calculator which does addition, subtraction, multiplication,
        and division with any 2 number
        a) When user entered 10.2 and 5 and + sign your code should print "The result is
        15.2" on the console
        b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
        on the console
        c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
        on the console
        d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
        on the console
     */
    public static void main(String[] args) {

//        float num = 10.2f;
//        String operation = "/";
//
//        for (int i = 1; i < 11; i++) {
//            if (operation.equals("+")) {
//                System.out.print(+num + "+" + i + "=" + (num + i) + " ");
//            } else if (operation.equals("-")) {
//                System.out.print(+num + "-" + i + "=" + (num - i) + " ");
//
//            } else if (operation.equals("*")) {
//                System.out.print(+num + "*" + i + "=" + (num * i) + " ");
//
//            } else if (operation.equals("/")) {
//                System.out.print(+num + "/" + i + "=" + (num / i) + " ");
//            }
//        }

        System.out.println();
        System.out.println("******************");

        float n=10f;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one of math operation + , _ , * , / ");
        String mathOperation=input.next();
        System.out.println("Enter a number");
        float num1=input.nextFloat();
        switch (mathOperation){
            case"+":
                for (int i = 1; i <11 ; i++) {
                    System.out.print(+num1 + "+" + i + "=" + (num1 + i) + " ");
                }
                break;
            case"-":
                for (int i = 1; i <11 ; i++) {
                    System.out.print(+num1 + "-" + i + "=" + (num1 - i) + " ");
                }
                break;
            case"*":
                for (int i = 1; i <11 ; i++) {
                    System.out.print(+num1 + "*" + i + "=" + (num1 * i) + " ");
                }
                break;
            case"/":
                for (int i = 1; i <11 ; i++) {
                    System.out.print(+num1 + "/" + i + "=" + (num1 / i) + " ");
                }
                break;

        }
    }
}