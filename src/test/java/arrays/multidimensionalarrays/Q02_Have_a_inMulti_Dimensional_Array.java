package arrays.multidimensionalarrays;

import java.util.Arrays;

public class Q02_Have_a_inMulti_Dimensional_Array {

    //Print the elements which have "a" from a 2 dimensional String array.
    public static void main(String[] args) {

        String md_arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for(String [] w:md_arr1){
//           System.out.print(Arrays.toString(w));//[learn, java, it][is, easy]
//            System.out.println(w[0]);//learn is

            for(String n:w) {
           //     System.out.print(n + " ");//learn java it is easy

                if(n.contains("a")){
                    System.out.print(n+ " ");//learn java easy
                }
            }
            }
        }

    }

