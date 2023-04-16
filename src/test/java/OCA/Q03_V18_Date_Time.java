package OCA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Q03_V18_Date_Time {
    public static void main(String[] args) {

//        String date=LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);//.UnsupportedTemporalTypeException: Unsupported field: HourOfDay


            String dateandTime = "2014-05-04T01:30:00";
            DateTimeFormatter isoFormat = DateTimeFormatter.ISO_DATE_TIME;
            LocalDateTime dateTime = LocalDateTime.parse(dateandTime, isoFormat);

            System.out.println(dateTime+ "datetime");//2014-05-04T01:30datetime


//      Text '2014-05-04' could not be parsed

//        String dateandTime1 = "2014-05-04";
//        DateTimeFormatter isoFormat1 = DateTimeFormatter.ISO_DATE;
//        LocalDateTime dateTime1 = LocalDateTime.parse(dateandTime1, isoFormat1);
//        System.out.println(dateTime1 + "datetime");
//



    }



        }


