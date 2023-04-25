package uniqueelement;

import java.util.ArrayList;
import java.util.List;

public class Q05_UniqueWithList {

    /*
    Check if all elements are unique in an integer List by using loops.
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(311);
        myList.add(15);
        myList.add(31);
        myList.add(15);
        myList.add(10);

        List<Integer> list2=new ArrayList<>();


        for (int i = 0; i <myList.size()-1 ; i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                if(myList.get(i)==myList.get(j)){
                list2.add(myList.get(j));

                }

            }

        }

      //  System.out.println(list2);


       int counter=0;
        if (list2.isEmpty()) {
            System.out.println("All elements are unique");

        } else {

                counter++;

            }
        if(counter>0){
            System.out.println("these elements are " + list2 + "  not unique");
        }
        }



            }






