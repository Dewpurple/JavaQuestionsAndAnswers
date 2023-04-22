package arrays;

import java.util.Arrays;

public class Q03_SmallestPositiveGreatestNegative {

    /*
    Find the smallest positive element and greatest negative element in an integer array
    Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
     */

    public static void main(String[] args) {

        int num[] = {-12, 18, -5, 23, -2};
        Arrays.sort(num);
        System.out.println("Arrays.toString(num) = " + Arrays.toString(num));//[-12, -5, -2, 18, 23]


        int maxNegativeIntcont = num[0];
        int minPositiveIntCont=num[num.length-1];
        for(int w:num) {

            if(w<0) {
              maxNegativeIntcont=Math.max(maxNegativeIntcont,w);

            }else{
                minPositiveIntCont=Math.min(minPositiveIntCont,w);
            }

        }
        System.out.println("maxNegativeIntcont = " + maxNegativeIntcont);
        System.out.println("minPositiveIntCont = " + minPositiveIntCont);


        System.out.println();
        System.out.println("************ 2.way********");

        int minNegative=num[0];
        int maxPositive=num[num.length-1];

        for (int i = 0; i <num.length ; i++) {

            if(num[i]<0){
                minNegative=Integer.max(minNegative,num[i]);
            }else{
                maxPositive=Integer.min(maxPositive,num[i]);
            }

        }
        System.out.println("minNegative = " + minNegative);
        System.out.println("maxPositive = " + maxPositive);
    }
}
