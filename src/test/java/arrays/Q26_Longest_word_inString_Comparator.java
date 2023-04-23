package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Q26_Longest_word_inString_Comparator {

    // Find the longest word in a String
    public static void main(String[] args) {

        String s = "Mary went to visit to her grandmother";
        String [] sarr= s.split(" ");
        Arrays.sort(sarr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

        System.out.println("sarr[0] = " + sarr[0]);
    }
}
