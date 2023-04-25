package list;

import java.util.ArrayList;
import java.util.List;

public class Q06_RemoveSpecificElements {
    /*
    If a list has 15 or 13, remove them.
     */
    public static void main(String[] args) {

        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);

        if (h.contains(13) || h.contains(15)) {
            for (int i = 0; i < h.size(); i++) {
                System.out.println("h.get(h.indexOf(13)) = " + (h.indexOf(13)));//returns index no : 3
                // System.out.println("h.remove(3) = " + h.remove(3));// if I use this in for loop, Java will delete all elements whose index is 3
//                int idxForOnly13=h.indexOf(13);
//                System.out.println("h.remove(idxForOnly13) = " + h.remove(idxForOnly13));//if I use this, Java looks for 13 in all elements.When Java won't find 13 system responseIndexOutOfBoundsException
//
try {
    if (h.get(i) == 13 || h.get(i) == 15) {
        //1.way
        h.remove(h.indexOf(13));
        h.remove(h.indexOf(15));

        //2.way

//        int idxForOnly13 = h.indexOf(13);
//        int idxForOnly15 = h.indexOf(15);
//        System.out.println("h.remove(idxForOnly13) = " + h.remove(idxForOnly13));
//        System.out.println("h.remove(idxForOnly15) = " + h.remove(idxForOnly15));

    }

}catch (Exception e){
    System.out.println(h+ " inside try catch 13 and 15");
}
                }
            }else{
            System.out.println("13 and 15 does not exist in list");
        }

        System.out.println(h+ "out  of  try catch remove 13 and 15");


        //2.way

        List<Integer> h1 = new ArrayList<>();
        h1.add(10);
        h1.add(31);
        h1.add(15);
        h1.add(13);
        h1.add(54);
        h1.add(13);

        if (h1.contains(13) || h1.contains(15)) {
            for (int i = 0; i < h1.size(); i++) {

                    if (h1.get(i) == 13 || h1.get(i) == 15) {
                       if(h1.indexOf(13)==-1 || h1.indexOf(15)==-1){
                        continue;
                       }

                        h1.remove(h1.indexOf(13));
                        h1.remove(h1.indexOf(15));

                    }

            }
        }else{
            System.out.println("13 and 15 does not exist in list");
        }

        System.out.println(h+ "out  of  try catch remove 13 and 15");




        }
    }

