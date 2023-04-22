package arrays;

import java.util.Arrays;

public class Q12_PutSomeElementsto_EndOfArrays {

    /*
    Type code to put all zeros to end in an integer array.
    Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
     */

    public static void main(String[] args) {
        int[] arr = {5, 0, 2, 0, 3};
        int[] newArr = new int[arr.length];


        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));//[0, 0, 2, 3, 5]

        newArr[newArr.length-1]=0;

        int count=0;

        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] != 0) {
                newArr[count]+=arr[i];
                count++;
            }
                }
                System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));



            }
        }


