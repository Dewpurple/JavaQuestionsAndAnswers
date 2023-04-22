package arrays;

import java.util.Arrays;

public class Q24_StringArrays_Split {
    public static void main(String[] args) {
        //Put each word to an array as an element

        String warr = "I gonna go to visit my mom";
        System.out.println("Arrays.toString(warr) = " + warr);
        String[] sarr = warr.split(" ");
        System.out.println("Arrays.toString(sarr) = " + Arrays.toString(sarr));//[I, gonna, go, to, visit, my, mom]
        for (String w : sarr) {
            System.out.print(" " + w.length());// 1 5 2 2 5 2 3
        }

        String[] sOnearr = warr.split("X");
        System.out.println("Arrays.toString(sOnearr) = " + Arrays.toString(sOnearr));//[I gonna go to visit my mom]
        for (String w : sOnearr) {
            System.out.print(" " + w.length());//26
        }

        String[] s = warr.split("go to");
        System.out.println("Arrays.toString(s) = " + Arrays.toString(s));//[I gonna ,  visit my mom]
        for (String w : s) {
            System.out.print(" " + w.length());//8 13
        }

        String alphabet= "abcdefgh";
        String [] salphbt= alphabet.split("");
        System.out.println("Arrays.toString(salphbt) = " + Arrays.toString(salphbt));//[a, b, c, d, e, f, g, h]
        for (String w : salphbt) {
            System.out.print(" " + w.length());//1 1 1 1 1 1 1 1
        }

        System.out.println();
        System.out.println("************");
        //we can use for each loop with primitive char, but we will not use any method with primitive data type.
        char charArr[]=alphabet.toCharArray();
        System.out.println("Arrays.toString(charArr) = " + Arrays.toString(charArr));//[a, b, c, d, e, f, g, h]
        for (Character w : charArr) {
            System.out.print(" " + w.charValue());//a b c d e f g h
        }
    }
}