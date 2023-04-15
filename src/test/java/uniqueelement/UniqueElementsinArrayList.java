package uniqueelement;

import java.util.ArrayList;
import java.util.List;

public class UniqueElementsinArrayList {
    //   Check if all elements are unique in an integer List by using loops.

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);

        int count=0;
        String boxforUnique="";
        String boxforSame="";
        for(Integer w:myList){
            if(myList.indexOf(w)==myList.lastIndexOf(w)){
                count++;
                boxforUnique+=w+ " ";
            }else if(myList.indexOf(w)!=myList.lastIndexOf(w)){
                 boxforSame+=w+ " ";
                }
        }



        int same=myList.size()-count;
        int dif=myList.size()-same;

        if (count==myList.size()){
            System.out.println("All elements are unique");

        }else if(count!=myList.size()){
            System.out.println("There are "+same + " same elements,so they are; "+ boxforSame   );

            if(dif>0 && dif<myList.size())
            System.out.println("There are "+dif + " different elements, so " + boxforUnique +" are unique");


        }

    }
}
