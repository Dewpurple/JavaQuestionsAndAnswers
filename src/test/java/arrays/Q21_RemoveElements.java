package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q21_RemoveElements {

    /*
          /* Create an integer array by the help of user(ask user length and elements of array)
        * Ask user the index of element that user wants to remove.
        * Print the array on the console after removing
        */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length for an array");
        int length = input.nextInt();

        System.out.println("Enter numbers as many as what did you write as length");

        System.out.println("****** create an arrays for user*********");
        int[] arr=new int[length];
        for (int i = 0; i < arr.length ; i++) {
            arr [i]= input.nextInt();
        }
        System.out.println("This is your array = " + Arrays.toString(arr));
        System.out.println("Enter an index number to remove from Array");

        int idx=input.nextInt();
        if(idx<0 || idx> arr.length){
            System.out.println(" Index number have to be fix with your array");

        }else{
            int []newarr=new int[arr.length-1];

            int counter=0;
            for (int i = 0; i < arr.length ; i++) {
                if(i==idx){
                    continue;
                }
                newarr[counter] += arr[i];
                counter++;
            }
            System.out.println(Arrays.toString(newarr));
        }

    }
}
