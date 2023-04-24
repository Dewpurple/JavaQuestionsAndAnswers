package list;

import java.util.ArrayList;
import java.util.List;

public class Q02_SumOflElmntsBfrF_irstOccuranceBreak {
/*
Find the sum of all list elements before the first occurrence of 13 in an integer list
 */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum=0;
        for(Integer w:myList){

            if(w==13){
                break;
            }

            sum+=w;
        }
        System.out.println(sum);
    }
}
