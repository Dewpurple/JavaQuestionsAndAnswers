package switchstatementandoverloading;

import java.util.Scanner;
    /*
    Type a code to display the number of days in a given month of a given year.
     */
public class Q04_DisplayNumbersOfDaysGivenMonthofaGivenYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name");
        String a=input.next();


        if(!a.equalsIgnoreCase("february")){
            getDaysOfMonthsOfYear(a);
        }
        else {
            System.out.println("Enter a year ");
            int b = input.nextInt();
            getDaysOfMonthsOfYear(b);
        }
    }



    public static String getDaysOfMonthsOfYear(String a) {

        switch (a.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("31 Days ");
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 Days ");
                break;
            default:
                System.out.println(" You should write a month name");
                break;
        }


        return a;

    }

        public static int getDaysOfMonthsOfYear(int b){

               if (b % 100 == 0 && b % 400 == 0) {
                    System.out.println("29 Days");

                } else if (b % 100 != 0 && b % 4 == 0) {
                    System.out.println("29 Days");
                } else {
                    System.out.println("28 Days");
                }
                return b;
            }

            }








