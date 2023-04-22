package arrays;

import java.util.Arrays;

public class Q06_StartWith_a_A {

    /*
    Count how many words start with 'a' or 'A' in a given String
     */

    public static void main(String[] args) {

        String s = "Apex is an object oriented programming language";

        String []newS=s.split(" ");
        System.out.println("newS.length = " + newS.length);//7
        System.out.println("Arrays.toString(newS) = " + Arrays.toString(newS));//[Apex, is, an, object, oriented, programming, language]

        int count=0;
        for(String w:newS){
            if(w.startsWith("a") || w.startsWith("A") ){
                System.out.println("w = " + w);
                count++;
            }

        }
        System.out.println("count = " + count);

    }
}
