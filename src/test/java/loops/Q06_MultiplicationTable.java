package loops;

import java.util.Scanner;

public class Q06_MultiplicationTable {
    /*
    Type code to create multiplication table like
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number for multiplication table");
        int num=input.nextInt();

        for (int i = 1; i <11 ; i++) {
            System.out.print(num + "X" + i + "=" + num*i + " ");
        }





    }
}
