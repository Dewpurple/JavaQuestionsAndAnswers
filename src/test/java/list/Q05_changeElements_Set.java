package list;

import java.util.ArrayList;
import java.util.List;

public class Q05_changeElements_Set {

    /*
    If the list has 15 as element, change all 15s to 51
Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
     */


    public static void main(String[] args) {
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);

        for (int i = 0; i <g.size() ; i++) {
            if(g.get(i)==15){
                g.set(i,51);
        }
           }

        System.out.println("g = " + g);

        if(g.contains(15)){
            for(int w : g){
                if(w==15){
                    int idx = g.indexOf(15);
                    g.set(idx, 51);
                    System.out.println("idx = " + idx);
                }
            }
            System.out.println(g);
        }else{
            System.out.println("There is no expected element");
        }
    }
}
