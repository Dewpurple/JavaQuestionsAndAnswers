package arrays;

import java.util.Arrays;

public class Q15_TwoArraysAreSameOrNot {
/*
two arrays are same or not

 */
    public static void main(String[] args) {
        int a[] = {12, 7, 0, -32};
        int b[] = {12, 7, 0, -32};

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a, b));

        if(Arrays.equals(a, b)){
            System.out.println("Two arrays are same");
        }else{
            System.out.println("Two arrays are not same");
        }

    }
}
