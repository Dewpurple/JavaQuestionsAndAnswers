package list;

import java.util.ArrayList;
import java.util.List;

public class Q03_MultiplicationAllEvenList_Continue {
    /*
    Find the multiplication of all even list elements in an integer list
     */

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int mult=1;
        for(Integer w:myList){
            if(w%2==0){
                mult*=w;
            }
        }
        System.out.println(mult);

     //   2.way

        int mult1=1;
        for(Integer w:myList) {
            if (w % 2 != 0) {
                //   12!=0 false, 31!=0 true,  7!=0 true, 13!=0 true, 10!=0 false
                continue;
            }
            mult1 *= w;


        }
        System.out.println("mult1 = " + mult1);
    }
}
