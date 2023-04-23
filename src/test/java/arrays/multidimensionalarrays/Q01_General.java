package arrays.multidimensionalarrays;

import java.util.Arrays;

public class Q01_General {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("****** How to create multidimensional array *********");

        int mdArr1[][] = new int[3][2];

        System.out.println(Arrays.deepToString(mdArr1));//[[0, 0], [0, 0], [0, 0]]
        System.out.println();
        System.out.println("****** How to assign values *********");

        mdArr1[0][1] = 9;
        System.out.println(Arrays.deepToString(mdArr1));//[[0, 9], [0, 0], [0, 0]]
        mdArr1[2][0] = 1;
        System.out.println(Arrays.deepToString(mdArr1));//[[0, 9], [0, 0], [1, 0]]
        mdArr1[0][0] = 11;
        mdArr1[1][0] = 5;
        mdArr1[1][1] = 4;
        mdArr1[2][1] = 21;
        System.out.println(Arrays.deepToString(mdArr1));//[[11, 9], [5, 4], [1, 21]]

        System.out.println();
        System.out.println("******  How to create multidimensional array in short way *********");

        int mdArr2[][] = { {2, 3}, {12}, {21, 34, 56}, {4} };
        System.out.println(Arrays.deepToString(mdArr2));//[[2, 3], [12], [21, 34, 56], [4]]

        System.out.println();
        System.out.println("******  How to print a specific inner array on the console *********");

        System.out.println("Arrays.toString(mdArr2[0]) = " + Arrays.toString(mdArr2[0]));//[2, 3]

        System.out.println("Arrays.toString(mdArr2[2]) = " + Arrays.toString(mdArr2[2]));//

        System.out.println();
        System.out.println("******  length *********");

        System.out.println("mdArr2.length) = " +(mdArr2.length));//4
//[[2, 3], [12], [21, 34, 56], [4]]
        for(int [] w: mdArr2){
            System.out.print(w.length+ " ");//2 1 3 1
        }


        System.out.println();
        System.out.println("******  length -1 *********");

        System.out.println("(mdArr2.length-1) = " +(mdArr2.length-1));//3
            //[[21, 31], [123], [213, 349, 56], [499]]
        int mdArr3[][] = { {21, 31}, {123}, {213, 349, 56}, {499} };

        System.out.println("mdArr3[0][0] = " + mdArr3[1][0]);//123

        for(int [] w: mdArr3){
       //   System.out.print(w.length-1+ " ");//1 0 2 0
       //     System.out.println("w[0] = " + w[0]);//21 123 213 499
            System.out.println("w[0] = " + w[w.length-1]);//31 123 56 499


            for(int n:w){
                System.out.print(n+ " ");//21 31 123 213 349 56 499
            }
        }

        System.out.println();
        System.out.println("********* length with String Arrays and MD ");
        String md_arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };


        for(String [] w:md_arr1){
            //      System.out.println(w.length);//3 2

            for(String n:w){
                System.out.print(n.length()+ " ");//5 4 2 2 4
            }
        }


        System.out.println();
        System.out.println("***********compare with one dimensional arrays ****************8");
        String [] arr={"learn", "java", "it", "is", "easy"};

        for(String w:arr){
            System.out.print(w.length()+ " ");//5 4 2 2 4
        }

    }
}
