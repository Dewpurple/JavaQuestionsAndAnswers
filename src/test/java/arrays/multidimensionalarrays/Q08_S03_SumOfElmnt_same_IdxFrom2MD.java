package arrays.multidimensionalarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

//        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
//        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
//
//        int newLenMD = 0;
//        if (arr1.length <= arr2.length) {
//            newLenMD += arr1.length;
//
//        }
//
//        int lengthForMD = arr1[0].length;//3
//        int lengthForMD2 = arr2[0].length;//3
//
//        for (int i = 0; i < arr1.length; i++) {//arr1[i].length=2
//            for (int j = 0; j < arr2.length; j++) {//arr2.length=2
//                lengthForMD = Integer.max(lengthForMD, arr1[i].length);
//                lengthForMD2 = Integer.max(lengthForMD2, arr2[j].length);
//
//            }
//        }
//
//
//        int innerLen = 0;
//
//        if (lengthForMD > lengthForMD2) {
//            System.out.println("this is not concerning about our answer");
//        } else {
//            innerLen += lengthForMD;
//
//        }
//        int[][] newArr = newArr = new int[newLenMD][innerLen];//[3] [3]
////{{1, 2}, {3, 4, 5}, {6}}
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {//2  3  1
//                newArr[i][j] += arr1[i][j];//[[1, 2, 0], [3, 4, 5], [6, 0, 0]]
//
//            }
//            System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(newArr));
//
//            int nLen = innerLen;
//            System.out.println("nLen = " + nLen);
//            for (int l = 0; l < arr2[i].length; l++) {
//                if (newArr[i][l] != 0) {
//                    newArr[i][l] += arr2[i][l];
//                }
//
//                if ((newArr[i].length != arr1[i].length) || (newArr[i][l] == 0) || (newArr[i].length != arr2[i].length)) {
//                    nLen--;
//                }
//            }
//            System.out.println("nLen = " + nLen);
//            System.out.println("Arrays.deepToString(newArr) = " + Arrays.deepToString(newArr));//[[8, 10, 0], [13, 15, 5], [18, 0, 0]]
//            System.out.println("Arrays.deepToString(arr1) = " + Arrays.deepToString(arr1));//[[1, 2], [3, 4, 5], [6]]
//            System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));//[[7, 8, 9], [10, 11], [12]]
//
//
//            int[][] newArr2 = new int[newArr.length][nLen];
//            System.out.println("newArr.length = " + newArr.length);
//            System.out.println("nLen = " + nLen);
//
//            for (int j = 0; j < newArr.length; j++) {
//
//                for (int k = 0; k < nLen; k++) {
//                    System.out.println("newArr[j][k] = " + newArr[j][k]);
//                    newArr2[j][k] += newArr[j][k];
//
//                }
//            }
//            System.out.println("Arrays.deepToString(newArr2) = " + Arrays.deepToString(newArr2));

        //3.way

        int[][] arr1 = {{11, 22}, {33, 44, 50}, {60}};
        int[][] arr2 = {{70, 80, 90}, {100, 110}, {120}};



        int ttl[][] = new int[arr1.length][];
        
        ttl[0] = new int[3];
        ttl[1] = new int[4];
        ttl[2] = new int[2];

        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr1[i].length; j++)
                ttl[i][j] = arr1[i][j];

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                ttl[i][j] += arr2[i][j];
                System.out.println("ttl[i][j] = " + ttl[i][j]);
            }
            System.out.println();
        }
    }
}

//            int nA[][]=new int[newArr.length][];
//            if(newArr2[i][j])
//            nA[0]=new int[]{8,10};
//            nA[1]=new int[]{13,15};
//            nA[2]=new int[]{18};






























