package arrays.multidimensionalarrays;

import java.util.Arrays;

public class Q00_JaggedArrays {

    /*
    Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
        arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
     */


    public static void main(String[] args) {

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int len1 = arr1.length;//3
        int len2 = arr2.length;//3

        if (len1 < len2 || len1 == len2) {

            int[][] nadd = new int[len1][];

            for (int i = 0; i < arr1.length; i++) {

                for (int j = 0; j < arr1[i].length; j++) {
                  //  System.out.print("\n arr1[i][j] = \n" + arr1[i][j]);//1 2 3 4 5
                }
                for (int k = 0; k < arr2[i].length; k++) {
                  //  System.out.println("arr2[i][k] = " + arr2[i][k]);//7 8 9 10 11 12
                }

                if ((arr1[i].length == arr2[i].length)) {
                    nadd[i] = new int[arr1[i].length];

                }if ((arr1[i].length < arr2[i].length)) {

                    nadd[i] = new int[arr1[i].length];

                }if ((arr1[i].length > arr2[i].length)) {

                    nadd[i] = new int[arr2[i].length];

                }

                for (int j = 0; j <nadd[i].length ; j++) {
                    nadd[i][j] = arr1[i][j] + arr2[i][j];

                }
                }

            System.out.println("Arrays.toString(narr1) = " + Arrays.deepToString(nadd));
            }else{

        }

        }

                }















