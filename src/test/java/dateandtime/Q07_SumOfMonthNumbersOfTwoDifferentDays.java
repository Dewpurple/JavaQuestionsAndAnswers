package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Q07_SumOfMonthNumbersOfTwoDifferentDays {

    public static void main(String[] args) {
       // Find the sum of the month numbers of two different dates

        LocalDate firstDate= LocalDate.of(2020, Month.APRIL,28);
        LocalDate secondDate=LocalDate.of(2022,Month.DECEMBER,25);

        System.out.println("firstDate.getMonth()+secondDate.getMonth() = " + firstDate.getMonth() + secondDate.getMonth());

        /*
        Find the difference in days for two different dates
         */

        System.out.println("ChronoUnit.DAYS.between(firstDate,secondDate) = " + ChronoUnit.DAYS.between(firstDate, secondDate));


    }
}
