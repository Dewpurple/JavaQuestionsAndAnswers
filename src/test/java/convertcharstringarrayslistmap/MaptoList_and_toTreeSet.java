package convertcharstringarrayslistmap;

import java.util.*;

public class MaptoList_and_toTreeSet {


    /*
    There is a Map which contains product names as key and number of the products as value.
    Print the product names in alphabetical order.
     */
    public static void main(String[] args) {
        convertMapToList();

    }

    public static void convertMapToList() {

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);


        convertSetListArray(product);
        convertSetTreeSet(product);
    }

    public static void convertSetListArray(Map<String, Integer> product) {
        Set<String> setOfProductKey = product.keySet();
        System.out.println("setOfProductKey = " + setOfProductKey);//[Laptop, TV, Refrigerator, Music System, Mobile Phone]

        System.out.println("*******  Set convert to ListArray ****************");
        List<String> listOfProductKey = new ArrayList<>(setOfProductKey);
        Collections.sort(listOfProductKey);
        System.out.println("listOfProductKey = " + listOfProductKey);//[Laptop, Mobile Phone, Music System, Refrigerator, TV]

    }

        public static void convertSetTreeSet(Map<String, Integer> product) {
        Set<String> setOfProductKey = product.keySet();

        System.out.println("setOfProductKey = " + setOfProductKey);//[Laptop, TV, Refrigerator, Music System, Mobile Phone]
        System.out.println("*******  Set convert to TreeSet ****************");

        TreeSet<String> tProductKey = new TreeSet<>(setOfProductKey);//[Laptop, Mobile Phone, Music System, Refrigerator, TV]
        System.out.println("tProductKey = " + tProductKey);//[Laptop, Mobile Phone, Music System, Refrigerator, TV]

    }
}

