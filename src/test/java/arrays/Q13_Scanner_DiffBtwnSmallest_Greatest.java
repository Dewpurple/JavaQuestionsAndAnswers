package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_Scanner_DiffBtwnSmallest_Greatest {

    /*
    Create an integer array by getting the elements from the user then print the difference
between the smallest and the greatest elements on the console.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length of an arrays");
        int length=input.nextInt();
        System.out.println("enter elements as many as what did you write the lenght ");


        int [] arrFromUser=new int[length];
        for (int i = 0; i <length ; i++) {
          arrFromUser[i]+=input.nextInt();
        }

        Arrays.sort(arrFromUser);

//        int difArrFirst_Last= arrFromUser[arrFromUser.length-1]-arrFromUser[0];
//        System.out.println("difArrFirst_Last = " + difArrFirst_Last);
    }
}
