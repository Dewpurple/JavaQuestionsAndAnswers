package list;

import java.util.ArrayList;
import java.util.List;

public class Q07_ClosestIntElmnt_Continue {
/*
    Find the closest 2 integers in an Integer List
    Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
 */

    public static void main(String[] args) {

        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);

    //    System.out.println("h.get(0) = " + h.get(0));//12 returns element
        int min=Math.abs(h.get(0)-h.get(1));
        int dif=min;
       // System.out.println("min = " + min);

        for (int i = 0; i <h.size() ; i++) {
            for (int j = h.size()-1; j > 0 ; j--) {

                 dif=Math.abs((h.get(i)-h.get(j)));

                if(dif==0){
                    continue;
}
                min=Math.abs(Math.min(dif,min));
         //       System.out.print ("dif = " + dif + " ");

                if((dif)!=min){
                    continue;
                }

                System.out.println("between \n" +h.get(i) + " and " + h.get(j) +" are closest 2 elements in the List");


            }



        }

    }
}
