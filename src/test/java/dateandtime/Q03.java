package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Q03 {
    /*
    Date of birth of Jane is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
    and 12 days after Jane's birth date.
     */
    public static void main(String[] args) {

        LocalDate dob= LocalDate.of(1997, Month.JUNE,04);
        LocalDate plusToDob = dob.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("plusToDob = " + plusToDob);


        System.out.println();
        System.out.println("***************");

//        a person was born 45 years, 8 months and 5 days       ===>after 29 October 1923.
//        another person was born 24 years, 2 months and 11 days ===>before 15 September 1993.
//        Type code to calculate the exact date of birth of first and second person
//        Type code to check if the date of birth of first Person and Second one is the same or not.

         LocalDate firstDOB= LocalDate.of(1923,Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
         LocalDate secondDOB=LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);

    //     System.out.println("Date of births are same " + firstDOB.equals(secondDOB));



        if(firstDOB.isBefore(secondDOB)){
            System.out.println("first one is older than the second " );
        }else if(firstDOB.isEqual(secondDOB)){
            System.out.println("Date of births are same comes from if " );
        }else{
            System.out.println("Second one is older than the second " );
        }

        System.out.println();
        System.out.println("***************");

//        A person was born 3 years and 11 days after his sister.
//        His sister gave you her date of birth as 24th of November 2012
//        Type code to calculate his date of birth.

        LocalDate dobOfsister= LocalDate.of(2012,Month.NOVEMBER,24);
        LocalDate dobOfHis=dobOfsister.plusYears(3).plusDays(11);

        System.out.println("dobOfHis = " + dobOfHis);

        System.out.println();
        System.out.println("***************");








    }
}
