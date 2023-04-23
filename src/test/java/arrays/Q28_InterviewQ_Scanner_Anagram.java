package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q28_InterviewQ_Scanner_Anagram {

    /*
    /*
         ===Interview Question===
        * Anagram is to create a new word from other word's characters.
		 * Write java code to check if two words are anagram or not
		 * isAnagram("listen", "Silent") ==> anagram
		 * Dormitory = Dirty room
		 * School master = The classroom
		 * Conversation = Voices rant on
		 * Listen = Silent
		 * Astronomer = Moon starer
        */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Pls Enter first String");
        String s1=input.next().toLowerCase();

        System.out.println("Pls Enter second String");
        String s2=input.next().toLowerCase();

        String [] sarr1=s1.replaceAll(" ","").replaceAll("\\p{Punct}","").split("");
        String [] sarr2=s1.replaceAll(" ","").replaceAll("\\p{Punct}","").split("");

        Arrays.sort(sarr1);
        Arrays.sort(sarr2);

        System.out.println("Arrays.toString(sarr1).length() = " + Arrays.toString(sarr1).length());//18
        System.out.println("Arrays.toString(sarr1) = " + Arrays.toString(sarr1));//[e, i, l, n, s, t]

        System.out.println("Arrays.toString(sarr2).length() = " + Arrays.toString(sarr2).length());//18
        System.out.println("Arrays.toString(sarr1) = " + Arrays.toString(sarr2));//[e, i, l, n, s, t]


        if(Arrays.equals(sarr1,sarr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
