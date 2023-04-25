package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q09_SumOfStringList {

    /*
    Find the sum of all prices given in a String list
    Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
     */

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");

        System.out.println("myList.get(0).replaceAll(\"$\",\"\") = " + myList.get(0).replace("$", ""));

        List<Double>list_double=new ArrayList<>();



        String s="";
        for (int i = 0; i < myList.size() ; i++) {

//            System.out.println("myList.get(i) = " + myList.get(i));//$12.99 $23.60 $8.25 $54.45
//            System.out.println(myList.indexOf(myList.get(i)));//0 1 2 3

            if(myList.get(i).contains("$")) {
             s=myList.get(i).replace("$", "");
            }

            Double priceAsDouble=Double.valueOf(s);

            list_double.add(priceAsDouble);

            Collections.sort(list_double);
            System.out.println("myList after sort= " + list_double);

            double ttl=list_double.get(0)+list_double.get(list_double.size()-1);
            System.out.println(" sum of the price is with the greatest value and smallest value  =" +ttl);
        }






    }



    }


