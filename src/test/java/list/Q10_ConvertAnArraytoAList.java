package list;

import java.util.ArrayList;
import java.util.List;

public class Q10_ConvertAnArraytoAList {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("*******convert an array to ArrayList***********");

        int arr[]={4,5,6,7,8,9};

        List<Integer> listArr=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            listArr.add(arr[i]);

        }
        System.out.println("listArr = " + listArr);

    }
}
