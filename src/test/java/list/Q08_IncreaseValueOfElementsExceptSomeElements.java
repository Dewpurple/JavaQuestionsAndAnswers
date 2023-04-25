package list;

import java.util.ArrayList;
import java.util.List;

public class Q08_IncreaseValueOfElementsExceptSomeElements {

    /*
    Increase the value of every element except 7 and 10 by 2 in a List
    Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)
     */

    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);

        for (int i = 0; i < h.size() ; i++) {
            if(h.get(i)==7 || h.get(i)==10){
                continue;
            }
            int sum= h.get(i)+2;
            System.out.print("\nincrease +2 = \n" +h.get(i) + "+2 = " + sum);
        }

        System.out.println();
        System.out.println("*********** 2.way with set method********");

        int ttl=0;
        for(Integer w:h){
            if(w==7 ||w==10){
                continue;
            }

            ttl=h.set(h.indexOf(w),w+2);

            System.out.print( "\n" +w + "+2=" +ttl);

        }

    }
}
