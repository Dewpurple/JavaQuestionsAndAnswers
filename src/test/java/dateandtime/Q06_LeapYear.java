package dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class Q06_LeapYear {
    /*
    Type code to check if a given year is “Leap year” or not
    Leap Year:
     */
    public static void main(String[] args) {

        LocalDate aDate = LocalDate.of(1993, Month.FEBRUARY, 01);
        boolean leapYearWithDateTime = aDate.isLeapYear();
        if (leapYearWithDateTime) {
            System.out.println("this year is leap");
        } else {
            System.out.println("this year is not leap");
        }



    }
}