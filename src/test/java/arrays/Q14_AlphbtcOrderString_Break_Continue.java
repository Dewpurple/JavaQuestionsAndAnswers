package arrays;

import java.util.Arrays;

public class Q14_AlphbtcOrderString_Break_Continue {

    /*
     //Create a String array and print the elements in alphabetical order on the console in different lines

     */


    public static void main(String[] args) {

        String [] sArr= new String[4];
        sArr[0] = "Van";
        sArr[1] = "John";
        sArr[2] = "Bryan";
        sArr[3] = "Andrea";


        System.out.println("*********  How to put the elements in alphabetical order*************");
        Arrays.sort(sArr);
        System.out.println("Arrays.toString(sArr) = " + Arrays.toString(sArr));//Andrea Bryan John Van

        System.out.println("*********  How to print the elements in different lines*************");
        System.out.println("*********Print the list elements if the number of characters is less than 4*************");

        for(String w: sArr) {
            System.out.println(w);//How to print the elements in different lines
            if (w.length() < 4) {
                System.out.println("length less than 4= " + w);
            }
        }

        System.out.println("*********Print the list elements before \"Bryan\"*************");
        for(String w: sArr) {//Andrea Bryan John Van
           if(w.equals("John")){//Andrea.equalsJohn==>false, Bryan.equalsJohn==>false, John.equalsJohn==>true
               break;
           }
            System.out.println("Before John = " + w);//Andrea Bryan

        }

        System.out.println("*********Print the list elements except \"John\"*************");
        for(String w: sArr) {//Andrea Bryan John Van
            if (w.equals("John")) {//Andrea.equalsJohn==>false, Bryan.equalsJohn==>false, John.equalsJohn==>true, Van.equalsJohn==>false
                continue;
            }
            System.out.println("Except John = " + w);//Andrea Bryan Van


        }
    }
}
