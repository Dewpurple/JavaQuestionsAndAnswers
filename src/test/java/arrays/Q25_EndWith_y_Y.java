package arrays;

import java.util.Arrays;

public class Q25_EndWith_y_Y {
    //Print the words ending with "y" or "Y
    public static void main(String[] args) {
        String t="Learn Java, earn money";
        t=t.replaceAll("\\p{Punct}","");
        System.out.println("t = " + t);//Learn Java earn money

        //
//       t=t.replaceAll("\\W","");
//       System.out.println("t = " + t);//LearnJavaearnmoney

        String [] tarr= t.split(" ");
        System.out.println("Arrays.toString(tarr) = " + Arrays.toString(tarr));

        for (String w:tarr){
            if(w.endsWith("y")|| w.endsWith("Y")){
                System.out.println(w + " ");//money
            }
        }

    }




}
