package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Q04_ChronoUnitsBetweenTwo {
    public static void main(String[] args) {


        //        Create a Date Value for a birth date and create Date Value for another 2 birth dates then
        //        calculate the difference between first and second, first and third in days.

        LocalDate dob1 = LocalDate.of(1992, 04, 20);
        LocalDate dob2 = LocalDate.of(2010, 01, 20);
        LocalDate dob3 = LocalDate.of(2015, Month.MARCH, 31);

        long diff1 = ChronoUnit.DAYS.between(dob1, dob2);
        long diff2 = ChronoUnit.DAYS.between(dob1, dob2);
        System.out.println("diff1 = " + diff1);
        System.out.println("diff2 = " + diff2);


       /*
    Type the code that finds out how many days/months/decades a person lived.
    Date of birth of the person is 12th of May 2002
     */

        LocalDate bod = LocalDate.of(2002, Month.MAY, 12);
        LocalDate current = LocalDate.now();
        Long howManyDaysLived = ChronoUnit.DAYS.between(bod, current);
        System.out.println("howManyDaysLived = " + howManyDaysLived);

        System.out.println("ChronoUnit.DECADES = " + ChronoUnit.DECADES.between(bod, current));
        System.out.println("ChronoUnit.HOURS.between(bod,current) = " + ChronoUnit.MONTHS.between(bod, current));

    }
}

