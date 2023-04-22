package arrays;

import java.util.Arrays;

public class Q02_FindTheMiddleElement {

    /*
    Find the middle element in an integer array( after sort of from smallest to largest)
    Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
     */
    public static void main(String[] args) {

        int a[]={12,5,8,99};

        Arrays.sort(a);//[5,8,12]
        System.out.println("a.length = " + a.length);//3
        int aLength=a.length;

        if(aLength%2!=0){
            int middleIDXOfLengthForOddNumElements= a.length/2; // returns index number of middle element
            int middleElementsForOddNumElements=a[a.length/2];//returns element whic is in the middle of odd numbered arrays element
            System.out.println("middleElementsForOddNumOfElements = " + middleElementsForOddNumElements);


        }else {
            int middleIDXForEvenNumElements = a.length/2;
            System.out.println("middleIDXForEvenNumElements = " + middleIDXForEvenNumElements);//returns idx num 2
            int middleElementsForEvenNumElements1=a[aLength/2];
            int middleElementsForEvenNumElements2=a[aLength/2-1];
            System.out.println("middleElementsForEvenNumElements1 = " + middleElementsForEvenNumElements1);
            System.out.println("middleElementsForEvenNumElements2 = " + middleElementsForEvenNumElements2);


        }


    }
}
