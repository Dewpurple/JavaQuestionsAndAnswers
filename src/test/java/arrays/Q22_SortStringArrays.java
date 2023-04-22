package arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 //Sort the array elements according to their lengths.
 */
public class Q22_SortStringArrays {

    public static void main(String[] args) {
        String sarr[] = {"Van","Michael","Alf","Maria","Bunny","Taz"};

        System.out.println(Arrays.toString(sarr).length());//38 (With " " )
        for(String w:sarr){
            System.out.print(w.length()+ " ");//3 7 3 5 5 3     ttl 26

        }

        System.out.println();
        System.out.println("*****************");
        //Sort the array elements according to their lengths.

        Arrays.sort(sarr,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(sarr));//[Van, Alf, Taz, Maria, Bunny, Michael]

        Arrays.sort(sarr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(sarr));//[Michael, Maria, Bunny, Van, Alf, Taz]

        System.out.println();
        System.out.println("*******natural order with alphabetical and lenght or ascending orders with numbers**********");
        Arrays.sort(sarr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(sarr));//[Michael, Bunny, Maria, Alf, Taz, Van]

        Arrays.sort(sarr,Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(sarr));//[Alf, Taz, Van, Bunny, Maria, Michael]
    }
}
