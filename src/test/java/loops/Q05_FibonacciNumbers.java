package loops;

import java.util.Scanner;

public class Q05_FibonacciNumbers {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("How many fibonacci numbers do u want to see??");
        int numFibonacci=input.nextInt();




        int ff1=0;
        int ff2=1;
        int cont=0;
        //0 1 1 2 3 5 8
      //  System.out.println(ff0 + " " +ff1 );
        System.out.print(ff1+" "+ff2+ " " );

        for (int i = 2; i <numFibonacci-1 ; i++) {
                cont=ff1+ff2;//1        ff1=1,ff2=1=>cont=2     ff1=1+ff2=2=3
            System.out.print( +cont+ " " );
                ff1=ff2;//1             ff1=1   ff1=ff2(2)=2
                ff2=cont;//1            ff2=2   ff2=cont(3)=2

        }
        System.out.println();
        System.out.println("***********With do while *********************");

        int num1=0;
        int num2=1;
        int sum=0;
        int i=2;
        System.out.print(num1+ " " + num2+ " ");

        do{

            sum=num1+num2;
            System.out.print( +sum+ " ");

            num1=num2;
            num2=sum;
            i++;


        }while(i<numFibonacci-1);

        }
        }



