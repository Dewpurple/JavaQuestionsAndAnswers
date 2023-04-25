package arrays.multidimensionalarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08_S03_SumOfElmnt_same_IdxFrom2MD {

    /*
    Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
        arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
     */

    public static void main(String[] args) {
//        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
//        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
////        System.out.println(Arrays.toString(arr1[0]));//[1,2]
////        System.out.println(arr1.length);//3
////        System.out.println(arr2.length);//3
//
//
//        int newLenMD = 0;
//        if (arr1.length == arr2.length) {
//            newLenMD += arr1.length;
//
//        }
//        int lengthForMD = arr1[0].length;
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("arr1[i].length = " + arr1[i].length);
//            for (int j = 0; j < arr2.length; j++) {
//                System.out.println("arr2[j].length = " + arr2[j].length);
//                lengthForMD = Integer.max(arr1[0].length, arr2[i].length);
//            }
//        }
//        int[][] newArr = new int[newLenMD][lengthForMD + 1];
//        System.out.println("newArr[0].length = " + newArr[0].length);//3
//        System.out.println("arr1[0].length = " + arr1[0].length);
//      //  int[][] na2 = new int[newArr.length][newArr.length - 1];
//
//        List<Integer> larr = new ArrayList<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//
//                newArr[i][j] += arr1[i][j];//[[11, 12, 0], [13, 14, 15], [16, 0, 0]]
//                //0 0 =11, 0 1=12,
//            }
//            for (int l = 0; l < arr2[i].length; l++) {
//                if (newArr[i][l] == 0) {
//                    continue;
//                }
//                newArr[i][l] += arr2[i][l];
//
//                if ((newArr[i][l] == arr1[i][l]) && newArr[i][l] == 0) {
//                    continue;
//                }
//
//                larr.add(newArr[i][l]);
//
//
////                    na2[i][l]=newArr[i][l];
////
////                    if(na2[i][l]==0){
////                        continue;
////                    }
////                 larr.add(na2[i][l]);
//            }
//        }
//
//        //    System.out.println(Arrays.deepToString(na2));
//        System.out.println("larr = " + larr);


        //2.way

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
//        System.out.println(Arrays.toString(arr1[0]));//[1,2]
//        System.out.println(arr1.length);//3
//        System.out.println(arr2.length);//3


        int newLenMD = 0;
        if (arr1.length == arr2.length) {
            newLenMD += arr1.length;

        }
        int lengthForMD = arr1[0].length;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[i].length = " + arr1[i].length);
            for (int j = 0; j < arr2.length; j++) {
                System.out.println("arr2[j].length = " + arr2[j].length);
                lengthForMD = Integer.max(arr1[0].length, arr2[i].length);
            }
        }
        int[][] newArr = new int[newLenMD][lengthForMD + 1];
        System.out.println("newArr[0].length = " + newArr[0].length);//3
        System.out.println("arr1[0].length = " + arr1[0].length);
        int[][] na2 = new int[newArr.length][newArr.length - 1];



        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                newArr[i][j] += arr1[i][j];//[[11, 12, 0], [13, 14, 15], [16, 0, 0]]
                //0 0 =11, 0 1=12,
            }
            for (int l = 0; l < newArr[i].length; l++) {
                if (newArr[i][l] == 0) {
                    continue;
                }
                newArr[i][l] += arr2[i][l];

                if ((newArr[i][l] == arr1[i][l]) && newArr[i][l] == 0) {
                    continue;
                }

                               na2[i][l]=newArr[i][l];

                    if(na2[i][l]==0){
                        continue;
                    }

            }
        }

          System.out.println(Arrays.deepToString(na2));

    }

}














