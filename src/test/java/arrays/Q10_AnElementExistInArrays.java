package arrays;

import java.util.Arrays;

public class Q10_AnElementExistInArrays {

    /*
    Type code to find if a given element exists in a given array or not
     */

    public static void main(String[] args) {
        String[] arr = {"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s = "apex";

        int count=0;
        for(String w:arr) {
            if (w.equalsIgnoreCase(s)) {
                count++;
            }
        }
            if(count>0){
                System.out.println("String s exists in arrays");
            }else{
                System.out.println("String s does not exist in arrays");
            }

        System.out.println();
        System.out.println("******* for integer arrays exist or not*********");
        int a[] = {32, 14, 2, 11};
        int b=14;

        int m=0;
        for(int w:a){
            if(w==b){
                m++;

            }
        }

        if(m>0){
            System.out.println("Exist");
        }else{
            System.out.println("not exist");
        }

        System.out.println();
        System.out.println("******* for integer arrays exist or not  2.way*********");

        int a2[] = {32, 14, 2, 11};
        int b2=14;

        Arrays.sort(a2);//[2,11,14,32]
        System.out.println(Arrays.binarySearch(a2, 14));

    }
}
