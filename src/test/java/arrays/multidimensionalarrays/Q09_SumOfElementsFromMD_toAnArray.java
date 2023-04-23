package arrays.multidimensionalarrays;

import java.util.Arrays;

public class Q09_SumOfElementsFromMD_toAnArray {
    /*
    Find the sum of the elements in the array elements of the given multi dimensional array
    { {1,2,3}, {4,5}, {6,7} } and return an array.
    For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
    Multi Dimensional Arrays Questions
    5)
     */
    public static void main(String[] args) {
        int [][]arr={ {1,2,3}, {4,5}, {6,7} };
        int [] newarr=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                newarr[i]+=arr[i][j];
            }


        }
        System.out.println(Arrays.toString(newarr));
    }
}
