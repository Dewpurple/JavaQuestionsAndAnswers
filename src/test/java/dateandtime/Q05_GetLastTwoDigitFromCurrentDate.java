package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Q05_GetLastTwoDigitFromCurrentDate {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(" ***************************************");
        /*
        Get the last 2 digits of the year in current date
         */

        LocalDate current=LocalDate.now();
        System.out.println("current = " + current);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println("f.format(current) = " + dtf.format(current));

        System.out.println();
        System.out.println(" ***************************************");
        /*
        Get the last 2 digits of the year in current date for Tokyo( Year should be end of the date)
         */
        LocalDate currentInJapan=LocalDate.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter dtfJapan=DateTimeFormatter.ofPattern("dd-MM-yy");
        System.out.println("dtfJapan.format(currentInJapan) = " + dtfJapan.format(currentInJapan));



        System.out.println();
        System.out.println(" ***************************************");
         /*
        Get the last 2 digits of the year in current date for Tokyo( Year should be begin of the date)
         */
        LocalDate aDate= LocalDate.of(1993, Month.MAY,29);
        System.out.println("aDate = " + aDate);

        DateTimeFormatter dtfForaDate=DateTimeFormatter.ofPattern("yy-MM-dd");
        System.out.println("dtfForaDate = " + aDate.format(dtfForaDate));

        DateTimeFormatter dtfForaDate2=DateTimeFormatter.ofPattern("yy");
        System.out.println("dtfForaDate only year with last two digits with patern = " + aDate.format(dtfForaDate2));


        //2.way
        int last2Dgt=aDate.getYear()%100;
        System.out.println("dtfForaDate only year with last two digits with get method= " + last2Dgt);

    }
}
