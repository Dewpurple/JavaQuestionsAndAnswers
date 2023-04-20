package switchstatementandoverloading;

import java.util.Scanner;

public class Q02_fromNumberOfMonthtoMonthsName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int month = input.nextInt();

        getMonthsName(month);
    }



    public static int getMonthsName(int month) {

        if (month < 0) {
            System.out.println("You have to write a positive number");
        } else {

            switch (month) {

                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");

                    break;

                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;

                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("There are only 12 months in a year. You could write a number between 1 and 12 ");
                    break;
            }

        }
        return month;

    }

}
