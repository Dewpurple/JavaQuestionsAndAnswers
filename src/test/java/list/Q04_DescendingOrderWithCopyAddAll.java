package list;

import java.util.*;

public class Q04_DescendingOrderWithCopyAddAll {
    /*
    Check if elements are in descending order in a list
    Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
    (Yellow, Red, Green, Blue) ==> Output: It is in descending order
     */
    public static void main(String[] args) {
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        System.out.println("e.get(0) = " + e.get(0));

        List<String> new_e = new ArrayList<>();
        new_e.addAll(e);
        Collections.sort(new_e);

        System.out.println("new_e = " + new_e);

        int idx=0;
        int flag=0;
        for (int i = e.size()-1; i <=0 ; i++) {
            if(e.get(idx)==new_e.get(i)){
                flag++;
            }
        }

        if(flag==e.size()){
            System.out.println("Descending");
        }else{
            System.out.println("Ascending");
        }

        }


    }

