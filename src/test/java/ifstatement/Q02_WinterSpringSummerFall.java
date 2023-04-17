package ifstatement;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_WinterSpringSummerFall {
    /*
    Type code to print
    a) "Winter" for December, January, February
    b) "Spring" for March, April, May
    c) "Summer" for June, July, August
    d) "Fall" for September, October, November
    e) "Invalid month name" for all the others
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

            System.out.println("enter one of months name");
            String monthName=input.next();

        boolean winterTime=monthName.equalsIgnoreCase("December")||
                           monthName.equalsIgnoreCase("January")||
                           monthName.equalsIgnoreCase("February");

        boolean springTime=monthName.equalsIgnoreCase("March")||
                           monthName.equalsIgnoreCase("April")||
                            monthName.equalsIgnoreCase("May");

        boolean summerTime=monthName.equalsIgnoreCase("June")||
                            monthName.equalsIgnoreCase("July")||
                            monthName.equalsIgnoreCase("August");

        boolean fallTime=monthName.equalsIgnoreCase("September")||
                            monthName.equalsIgnoreCase("October")||
                            monthName.equalsIgnoreCase("November");

        if(winterTime){
            System.out.println("Winter time ");
        }else if(springTime){
            System.out.println("Spring time ");
        }else if(summerTime){
            System.out.println("Summer time ");
        }else if(fallTime){
            System.out.println("Fall time ");
        }else{
            System.out.println("Invalid month name");
        }


        }

        }















