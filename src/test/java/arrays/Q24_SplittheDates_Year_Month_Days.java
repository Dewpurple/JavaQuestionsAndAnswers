package arrays;

import java.util.Arrays;

public class Q24_SplittheDates_Year_Month_Days {

    /*
       Please split the dates and get day, month and the year separately on the console
       day : 25
       month : 04
       year : 2023
        */
    public static void main(String[] args) {

        String date="04/25/2023";
        String [] date_arr=date.split("/");

        System.out.println("Arrays.toString(date_arr) = " + Arrays.toString(date_arr));//[04, 25, 2023]
        System.out.println("Arrays.toString(date_arr) = " + (date_arr[0]));//04
        System.out.println("date.split(\"/\")[0] = " + date.split("/")[0]);//04


    }
}
