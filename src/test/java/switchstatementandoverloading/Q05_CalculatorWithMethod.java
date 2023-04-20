package switchstatementandoverloading;

import java.util.Scanner;

public class Q05_CalculatorWithMethod {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please write one of them for calculator   +, -,*,/ ");

        String signmathOperation=input.next();
        getMathOperation(signmathOperation);



        System.out.println("Please write one of them for a math operation +, -,*,/ ");

        try {
            char signOfMathOperation = input.next(".").charAt(0);
            getMathOperation(signOfMathOperation);
        }catch(Exception ex){
            System.out.println("You should write only ONE of these SIGN   + , -, / , *");
        }


    }

    public static char getMathOperation(char mathoperation){
        Scanner input =new Scanner(System.in);
        System.out.println("please write a number");
        double num1=input.nextDouble();
        System.out.println("please write another number");
        double num2=input.nextDouble();

        switch (mathoperation){
            case '+':
                System.out.println(num1+ "+"+ num2+ "=" +(num1+num2));
            break;
            case '-':
                System.out.println(num1+ "-"+ num2+ "=" +(num1-num2));
                break;
            case '*':
                System.out.println(num1+ "*"+ num2+ "=" +(num1*num2));
                break;
            case '/':
                System.out.println(num1+ "/"+ num2+ "=" +(num1/num2));
                break;
            default:
                System.out.println("You might not have read the information, you have to write only one of them please +, -, *, /");
                break;
        }

        return mathoperation;
   }


    public static String getMathOperation(String mathOperation){
            Scanner input =new Scanner(System.in);
            System.out.println("please write a number");
            double num1 = input.nextDouble();


            switch (mathOperation) {
                case "+":
                    for (int i = 1; i < 11; i++) {
                        System.out.println(num1 + "+" + i + "=" + (num1 + i));
                    }
                    break;
                case "-":
                    for (int i = 1; i < 11; i++) {
                        System.out.println(num1 + "-" + i + "=" + (num1 - i));
                    }
                    break;
                case "*":
                    for (int i = 1; i < 11; i++) {
                        System.out.println(num1 + "*" + i + "=" + (num1 * i));
                    }
                    break;
                case "/":
                    for (int i = 1; i < 11; i++) {
                        System.out.println(num1 + "/" + i + "=" + (num1 / i));
                    }
                    break;
                default:
                    System.out.println("You might not have read the information, you have to write only one of them please +, -, *, /");
                    break;
            }


            return mathOperation;

        }
    }



