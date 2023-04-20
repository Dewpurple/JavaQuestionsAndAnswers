package ifstatement;

import java.util.Scanner;

public class Q09_BMI {
/*
        Type code to print the messages about the Body Mass Index(BMI) for the given BMI values
        Invalid BMI value < 0
        Underweight = <18.5
        Normal weight = 18.5–24.9
        Overweight = 25–29.9
        Obesity = BMI of 30 or greater
 */
    public static void main(String[] args) {

        //1.way
//        double bmi=20;
//
//        if(bmi<0){
//            System.out.println("Invalid value");
//        }
//        else if(bmi<18.5){
//            System.out.println("Underwait");
//        }
//        else if(bmi>=18.5 && bmi<=24.9) {
//            System.out.println("Normal weight");
//        }
//        else if(bmi>=25.00 && bmi<=29.9){
//            System.out.println("Overweight");
//        }else{
//            System.out.println("Obesity");
//        }


        System.out.println();
        System.out.println("****** 2.way ask user and with method ************");

        Scanner input = new Scanner(System.in);
        System.out.println(" enter your BMI index");
        double bmiIndex=input.nextDouble();


        getBmi(bmiIndex);

    }

    public static double getBmi(double bmiIndex){
        boolean minus0= bmiIndex<0;
        boolean forUnderweight=bmiIndex<18.5;
        boolean forNormalweight=bmiIndex>=18.5 && bmiIndex<=24.9;
        boolean forOverweight=bmiIndex>=25.0 && bmiIndex<=29.9;
        boolean forObesity=bmiIndex>=30;

        if(minus0){
            System.out.println("Invalid");
        }else if(forUnderweight) {
            System.out.println("Underweight");
        }else if(forNormalweight) {
            System.out.println("Normal weight");
        }else if(forOverweight) {
            System.out.println("Over weight");
        }else if(forObesity) {
            System.out.println("Obesity");
            {
            }
        }

        return bmiIndex;
    }
}
