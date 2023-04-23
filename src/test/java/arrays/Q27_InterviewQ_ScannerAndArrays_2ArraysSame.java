package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q27_InterviewQ_ScannerAndArrays_2ArraysSame {

    /*
    Ask to user enter 2 string arrays, and check their elements are same or not
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many words u want to enter an array String");
        int len=input.nextInt();
        System.out.println("enter String/s as many as how many did u want ");


        String sf[]= new String[len];
        for (int i = 0; i <len ; i++) {
           sf[i]= input.next().toLowerCase();
        }
        System.out.println("Arrays.toString(sf) = " + Arrays.toString(sf));


        System.out.println("Now how many words u want to enter for another array String");
        int len2=input.nextInt();
        System.out.println("enter String/s as many as how many did u want ");

        String sf2[] = new String[len2];
        for (int i = 0; i <len2 ; i++) {
            sf2[i]= input.next().toLowerCase();

        }
        System.out.println("Arrays.toString(sf2) = " + Arrays.toString(sf2));

        Arrays.sort(sf);
        System.out.println("Arrays.toString(sf) = " + Arrays.toString(sf));
        Arrays.sort(sf2);
        System.out.println("Arrays.toString(sf) = " + Arrays.toString(sf2));

        System.out.println("Arrays.equals(sf,sf2) = " + Arrays.equals(sf, sf2));

    }
}
