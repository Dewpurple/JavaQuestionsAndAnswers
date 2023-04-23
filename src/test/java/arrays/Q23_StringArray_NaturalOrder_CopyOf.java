package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Q23_StringArray_NaturalOrder {
    //Check if the array elements are in the natural order. "A", "B", "C" ==> true  -  "A", "C", "B" ==> false
    public static void main(String[] args) {
        String sarr[] = {"Albert", "Stranger","Camus", };
        System.out.println(Arrays.toString(sarr));//[Albert, Camus, Stranger]

        String []newSarr= new String[sarr.length];

        for (int i = 0; i < sarr.length ; i++) {

            newSarr[i]=sarr[i];
        }

        Arrays.sort(newSarr);
        System.out.println(Arrays.toString(newSarr));

        boolean equal2arr=Arrays.equals(sarr,newSarr);

        if(equal2arr){
            System.out.println("sarr array is natural order ");
        }else {
            System.out.println("sarr array is not natural order ");
        }


        System.out.println();
        System.out.println("********** 2.way ****************");
        String sarr2[] = {"Albert", "Stranger","Camus", };

        String newarr[]=Arrays.copyOf(sarr2,sarr2.length);
        System.out.println("Arrays.toString(newarr) = " + Arrays.toString(newarr));//[Albert, Stranger, Camus]

        Arrays.sort(newarr);
        System.out.println("Arrays.toString(newarr) = " + Arrays.toString(newarr));//[Albert, Camus, Stranger]

        if(Arrays.equals(newarr,sarr2)){
            System.out.println("sarr2 is natural order");
        }else {
            System.out.println("sarr2 is not natural order");
        }

    }
}
