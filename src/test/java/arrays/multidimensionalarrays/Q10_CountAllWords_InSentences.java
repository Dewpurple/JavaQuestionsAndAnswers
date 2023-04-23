package arrays.multidimensionalarrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q10_CountAllWords_InSentences {
    /*
    Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
    For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
    Hint: Use split()
     */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a sentences");
        String s= input.nextLine();

        String [] sarr= s.replaceAll("\\p{Punct}","").split(" ");

        System.out.println("Arrays.toString(sarr) = " + Arrays.toString(sarr));

        System.out.println(sarr.length);//14


    }



    }

