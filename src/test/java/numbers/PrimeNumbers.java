package numbers;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
               /*
Ask the user to enter an integer to check if it is a prime number or not. Example: if user
enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
prime number”, if user enters negative integers output will be “Enter a positive integer”
         */

        Scanner input = new Scanner(System.in);



        int flag=0;

        do{

            System.out.println("Enter a number");
            int num=input.nextInt();

            if(num<=0){
                System.out.println("enter a positive");
            }

                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        flag++;
                    }
                }


            if (flag == 2){
                System.out.println(" prime");
            }else if(flag!=2){
                System.out.println("not prime");
            }


            System.out.println("For Continue==> press C, For Exit ==> press E");
            String s= input.next();
            if(s.equalsIgnoreCase("E")){
                break;
            }else{

            }

        }while(true);





    }
}
