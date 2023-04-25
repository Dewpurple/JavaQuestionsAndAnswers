package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class General {



    public static void main(String[] args) {

        System.out.println();
        System.out.println("*******Why do we need ArrayList?***********");
        //ArratList is a resizable Array


        System.out.println();
        System.out.println("*******What is ArrayList?***********");


        //        While we create an array, we have to declare the size of an Array. The size of an Array cannot be modified.
//        However, we can add elements to an ArrayList and remove elements from ArrayList whenever we want. No need to create a new ArrayList
//        If you want to add elements to an Array or remove elements from an Array, you have to create a new Array.
//

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new List<>(); // DOES NOT COMPILE

        System.out.println(list3);


        System.out.println();
        System.out.println("*******add method***********");

        ArrayList<String> listSarr = new ArrayList<>();
        listSarr.add("John");

        listSarr.add(0, "Bunny");
        listSarr.add(1, "Bryan");
        listSarr.add("Taz");
        System.out.println("listSarr = " + listSarr);//[Bunny, Bryan, John, Taz]


        System.out.println();
        System.out.println("*******size method***********");

        System.out.println("listSarr.size() = " + listSarr.size());//4


        System.out.println();
        System.out.println("*******empty method***********");

        ArrayList<Integer> listarr = new ArrayList<>();

        System.out.println("listarr.isEmpty() = " + listarr.isEmpty());//true
        System.out.println("listSarr.isEmpty() = " + listSarr.isEmpty());//false

        System.out.println();
        System.out.println("*******remove method***********");

        List<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Hyundai");
        cars.add("Ford");
        System.out.println("cars = " + cars);//[Tesla, BMW, Toyota, Lexus, Hyundai, Ford]
        cars.remove("Hyundai");
        System.out.println("cars after remove= " + cars);//[Tesla, BMW, Toyota, Lexus, Ford]
        cars.remove(cars.size() - 1);
        System.out.println("cars after remove with index no= " + cars);//[Tesla, BMW, Toyota, Lexus]

        System.out.println("cars after remove without an element= " + cars.remove("Mazda"));//false
//        cars.remove(100);//an index number does not have exist in the List
//        System.out.println("cars after remove that does not have an exist = " + cars);//throws an IndexOutOfBoundsException

        System.out.println();
        System.out.println("*******set method***********");

//        The set() method changes one of the elements of the ArrayList without
//        changing the size.

        List<String> cars1 = new ArrayList<>();
        cars1.add("Tesla");
        cars1.add("BMW");
        cars1.add("Toyota");
        cars1.add("Lexus");
        cars1.add("Hyundai");
        cars1.add("Frd");
        System.out.println("cars1.size() = " + cars1.size());//6
        cars1.add("Honda");
        System.out.println("cars1.size() afeter add one more element = " + cars1.size());//7

        System.out.println("cars1.size() before set(change) one of elements = " + cars1);//[Tesla, BMW, Toyota, Lexus, Hyundai, Frd, Honda]
      //  cars1.set(7,"Ford");//IndexOutOfBoundsException
        cars1.set(5,"Ford");
        System.out.println("cars1.size() after set(change) one of elements = " + cars1);


        System.out.println();
        System.out.println("*******contains method***********");


        List<String> cars2 = new ArrayList<>();
        cars2.add("Tesla");
        cars2.add("BMW");
        cars2.add("Toyota");

        System.out.println("cars.contains(\"Tesla\") = " + cars.contains("Tesla"));//true
        System.out.println("cars.contains(\"not exist element\") = " + cars.contains("SUV"));//false

        List<Integer> num = new ArrayList<>();
        num.add(9);
        num.add(8);
        num.add(10);
        System.out.println("num.contains(9) = " + num.contains(9));//true
        System.out.println("num.contains(not exist element) = " + num.contains(7));//false

        System.out.println();
        System.out.println("*******sort method***********");

        List<Integer> num1 = new ArrayList<>();
        num1.add(9);
        num1.add(8);
        num1.add(10);
        Collections.sort(num1);//[8, 9, 10]
        System.out.println("num1 = " + num1);

        List<String> cars3 = new ArrayList<>();
        cars3.add("Tesla");
        cars3.add("BMW");
        cars3.add("Toyata");
        cars3.add("TI");
        cars3.add("Ta");
        Collections.sort(cars3);
        System.out.println("cars3 = " + cars3);//[BMW, TI, Ta, Tesla, Toyata]

        System.out.println();
        System.out.println("*******equals method we can compare two lists to see if they\n" +
                "contain the same elements in the same order***********");

        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        System.out.println(one.equals(two));//true

        one.add("A");
        System.out.println(one.equals(two));//false


        System.out.println();
        System.out.println("*******clear method***********");

        List<String> cars4 = new ArrayList<>();
        cars4.add("Tesla");
        cars4.add("BMW");
        cars4.add("Toyata");
        cars4.add("TI");
        cars4.add("Ta");

        System.out.println(cars4);//[Tesla, BMW, Toyata, TI, Ta]
        System.out.println("cars4.isEmpty() = " + cars4.isEmpty());//false
        cars4.clear();
        System.out.println(cars4);//[]
        System.out.println("cars4.isEmpty() after clear= " + cars4.isEmpty());//true



    }
}
