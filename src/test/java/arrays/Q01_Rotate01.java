package arrays;

import java.util.Arrays;

public class Q01_Rotate01 {
         /*
        Type a program like; given an array whose length is 3, return an array with the
        elements "rotated left"
        For example; if the array is [1, 2, 3] output will be [2, 3, 1].
         */

    public static void main(String[] args) {

        int [] num= {1,2,3};
        int [] newNum=new int[num.length];

        for (int i = 0; i <num.length-1 ; i++) {
            newNum[i]=num[i+1];
            newNum[newNum.length-1]=num[0];
        }

        System.out.println(Arrays.toString(newNum));

        System.out.println();
        System.out.println("***************  2.way *************");

        int [] numbers={1,2,3};
        int []rotateNumbers= new int[numbers.length];

        int firstIdx=numbers[0];
        rotateNumbers[rotateNumbers.length-1]=numbers[0];
        System.out.println("rotateNumbers = " + Arrays.toString(rotateNumbers));


        for (int i = 1; i < numbers.length ; i++) {

            System.out.println(i);
            rotateNumbers[i-1]+=numbers[i];
            //0+=2   1+=3

            System.out.println("Arrays.toString(rotateNumbers) = " + Arrays.toString(rotateNumbers));

        }
    }
}
