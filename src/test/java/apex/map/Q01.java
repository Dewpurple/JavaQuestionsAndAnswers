package apex.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q01 {

    public static void main(String[] args) {
//        There is a Map which contains product names as key and number of the products as value.
//               Type code to find the total number of products.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Collection<Integer> ttlNumOfProducts=product.values();

        int sum=0;
        for(int w:ttlNumOfProducts){
            sum+=w;
        }

        System.out.println("TTL number of product in warehouse : " +sum);


    }
}
