package arrays;

import java.util.Arrays;

public class Q01_ElementsRotate01 {
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
    }
}
