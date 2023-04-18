package loops;

import java.util.Scanner;

public class Q017_PrimeNumberOrNot {
    /*
    Ask the user to enter an integer to check if it is a prime number or not. Example: if user
    enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
    prime number”, if user enters negative integers output will be “Enter a positive integer”
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();

        int b = 0;

        try {
            for (int i = num; i > 0; i--) {
                if (num % i == 0) {
                    b++;
                }
            }
        }catch (Exception ex){
            System.out.println("b = " + b);
        }

            if (b <= 2) {
                System.out.println("prime");
            } else if (b > 2 ) {
                System.out.println("not prime");
            }


        System.out.println();
        System.out.println("******* 2.way ");

         if(num<0) {
            System.out.println("pls enter a positive number");
        }

        int count = 0;
        for (int i = num; i>0; i--) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count <= 2) {
            System.out.println("prime");
        } else if (count > 2 ) {
            System.out.println(" not prime");

        }

        System.out.println("count = " + count);


    }
}
