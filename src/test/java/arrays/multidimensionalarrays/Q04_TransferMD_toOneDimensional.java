package arrays.multidimensionalarrays;

import java.util.Arrays;

public class Q04_TransferMD_toOneDimensional {
    //Transfer elements from MD arr to one dimensional new arrays
    public static void main(String[] args) {
        String arr1[][] = {{"learn", "java", "it"}, {"is", "easy"}};
   //     System.out.println(arr1.length);//2

        int sum = 0;

        for (String[] w : arr1) {
      //      System.out.println(w.length);//3 2
            sum += w.length;


        }
      System.out.println("sum = " + sum);//5
        String arr2[] = new String[sum];

        int idx = 0;
        for (String[] w : arr1) {
            for (String n : w) {
                arr2[idx] = n;
                idx++;
            }
        }
            System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));//[learn, java, it, is, easy]

        System.out.println();
        System.out.println("********* +n 2 for each loop *************");
//        int idx1=0;
//        for(String [] w:arr1){
//            for (String n:w){
//                arr2[idx1]+=n;
//                idx1++;
//            }
//        }
//
//        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));//[nulllearn, nulljava, nullit, nullis, nulleasy]

        System.out.println();
        System.out.println("********* w[idx}*************");

//        int idx2 = 0;
//        for (String[] w : arr1) {
//         //   for (String n : w) {
//                arr2[idx2] = w[idx2];
//                idx2++;
//            }
//
//            System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));// [learn, easy, null, null, null]
        }



    }



