package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Q02 {
    /*
    Type the code that finds out how many days/months/decades a person lived.
    Date of birth of the person is 12th of May 2002
     */
    public static void main(String[] args) {

        LocalDate bod= LocalDate.of(2002, Month.MAY,12);
        LocalDate current=LocalDate.now();
        Long howManyDaysLived =ChronoUnit.DAYS.between(bod,current);
        System.out.println("howManyDaysLived = " + howManyDaysLived);

        System.out.println("ChronoUnit.DECADES = " + ChronoUnit.DECADES.between(bod,current));
        System.out.println("ChronoUnit.HOURS.between(bod,current) = " + ChronoUnit.MONTHS.between(bod, current));
    }
}
