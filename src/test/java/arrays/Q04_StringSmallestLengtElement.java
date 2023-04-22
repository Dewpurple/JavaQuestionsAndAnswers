package arrays;

import java.util.Arrays;

public class Q04_StringSmallestLengtElement {
    /*
    Find the elements whose length is the smallest and greatest in a String array
    Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
     */

    public static void main(String[] args) {
        String[] b = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

     //   System.out.println("b[0].length() = " + b[0].length());

        int maxLength=b[0].length();
        int minLength=b[0].length();
        for(String w:b){
        //   System.out.print("w.length() = " + w.length()+ " ");//w.length() = 5 w.length() = 8 w.length() = 4 w.length() = 5 w.length() = 4

           maxLength= Integer.max(maxLength,w.length());
           minLength=Integer.min(minLength,w.length());
        }
        System.out.println("maxLength = " + maxLength);
        System.out.println("minLength = " + minLength);


    }
        }


