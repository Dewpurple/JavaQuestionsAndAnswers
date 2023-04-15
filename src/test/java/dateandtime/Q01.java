package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        System.out.println("****** GET CURRENT DATE*******");

        LocalDate getCurrentDate=LocalDate.now();

        System.out.println("getCurrentDate = " + getCurrentDate);//2023-04-15

        System.out.println();
        System.out.println("****** GET COMPONENTS OF THE DATE*******");

        System.out.println("getCurrentDate.getYear() = " + getCurrentDate.getYear());//2023
        System.out.println("getCurrentDate.getMonth() = " + getCurrentDate.getMonth());//APRIL
        System.out.println("getCurrentDate.getDayOfWeek() = " + getCurrentDate.getDayOfWeek());//SATURDAY
        System.out.println("getCurrentDate.getDayOfMonth() = " + getCurrentDate.getDayOfMonth());//15
        System.out.println("getCurrentDate.getDayOfYear() = " + getCurrentDate.getDayOfYear());//105

        System.out.println();
        System.out.println("****** HOW TO GET CURRENT DATE IN A SPECIFIC ZONE*******");

        System.out.println("LocalDate.now(ZoneId.of(\"Asia/Tokyo\")) = " + LocalDate.now(ZoneId.of("Asia/Tokyo")));

     //   System.out.println(getCurrentDate(ZoneId.of("Asia/Tokyo"))); CTE

        System.out.println();
        System.out.println("****** HOW TO GO FUTURE AND PAST *******");

        System.out.println("getCurrentDate.plusYears(3).plusMonths(11).plusDays(90) = " + getCurrentDate.plusYears(3).plusMonths(11).plusDays(90));
        System.out.println("getCurrentDate.minusYears(10).minusMonths(1).minusDays(9) = " + getCurrentDate.minusYears(10).minusMonths(1).minusDays(9));

        System.out.println();
        System.out.println("****** do task *******");

        //type code to find the date that should be 10 years, 5 months 11 days ago
        System.out.println("LocalDate.now().minusYears(10).minusMonths(5).minusDays(11) = " + LocalDate.now().minusYears(10).minusMonths(5).minusDays(11));//2012-11-04

        //type code to find what day that should be 10 years, 5 months 11 days ago

        System.out.println("LocalDate.now().minusYears(10).minusMonths(5).minusDays(11).getDayOfWeek() = " + LocalDate.now().minusYears(10).minusMonths(5).minusDays(11).getDayOfWeek());//SUNDAY
        System.out.println("LocalDate.now().minusYears(10).minusMonths(5).minusDays(11).getDayOfWeek() = " + LocalDate.now().minusYears(10).minusMonths(5).minusDays(11).getDayOfMonth());//4
        System.out.println("LocalDate.now().minusYears(10).minusMonths(5).minusDays(11).getDayOfWeek() = " + LocalDate.now().minusYears(10).minusMonths(5).minusDays(11).getDayOfYear());//309


        System.out.println();
        System.out.println("****** COMPARE 2 DATES *******");

        System.out.println("LocalDate.of(2011, Month.APRIL,20) = " + LocalDate.of(2011, Month.APRIL, 20));//2011-04-20
        LocalDate aDate1=LocalDate.of(2011, Month.APRIL, 20);
        LocalDate aDate2=LocalDate.of(2000, Month.APRIL, 20);
        System.out.println(aDate1.isBefore(aDate2));//false
        System.out.println(aDate1.isAfter(aDate2));//true


        System.out.println();
        System.out.println("****** EXAMPLE *******");
        //Example 2: Type code to find the day whatever you want to write.

        System.out.println("LocalDate.of(1900,04,01) = " + LocalDate.of(1900, 04, 01).getDayOfWeek());//Sunday


        System.out.println();
        System.out.println("****** EXAMPLE *******");

        //Example 3: ask user a date for a booking application.
        //           If booking date is before current date give an error message like "Booking date cannot be past date"
        //           If booking date equals current date give a message like "We will call you when we have availability"
        //           If booking date is after current date give a message like "The ticket was booked"


        Scanner input = new Scanner(System.in);
        System.out.println("Year pls");
        int year=input.nextInt();

        System.out.println("Month pls");
        int month=input.nextInt();

        System.out.println("Day pls");
        int day=input.nextInt();

        System.out.println("LocalDate.of(year,month,day) = " + LocalDate.of(year, month, day));
        LocalDate cstmrDate=LocalDate.of(year, month, day);
        LocalDate current=LocalDate.now();
        System.out.println("current Date is = " + current);

        boolean beforeToday= cstmrDate.isBefore(current);
        boolean currentDayCheck=cstmrDate.isEqual(current);
        boolean afterToday=cstmrDate.isAfter(current);

        if(beforeToday){
            System.out.println("You cannot write a past date");
        }else if(currentDayCheck){
            System.out.println("You will be called by us");
        }else {
            System.out.println("Reservation was booked");
        }






    }


}
