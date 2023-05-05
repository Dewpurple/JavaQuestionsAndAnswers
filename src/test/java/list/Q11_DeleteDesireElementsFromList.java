package list;

import java.util.ArrayList;

public class Q11_DeleteDesireElementsFromList {

    // delete the desired element (how many) from a given array and leave the rest
//  create a method that prints it as a new list

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int unWantedElement=5;
        getDeleteunwantedElements(arr,unWantedElement);
    }

    public static void getDeleteunwantedElements(int arr[], int remove){

        ArrayList<Integer>newList=new ArrayList<>();

        for(Integer w:arr){
            if( w!=remove){
                newList.add(w);
            }
        }
        System.out.println("newList = " + newList);

    }
}
