package uniqueelement;

import java.util.ArrayList;
import java.util.List;

public class Q06_UniqueElementsWithMethod {

    //Type code, and whether there are duplicate elements in ArrayList, and to print all elements once on the console.
    public static void main(String[] args) {
      containsNumbers();
        System.out.println("*****************2 Way***********");

        List<Integer> numbers2 = new ArrayList<>();

        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(1);
        numbers2.add(7);
        System.out.println(numbers2);

        getOnceAllElements(numbers2);
    }

    public static void containsNumbers(){

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(1);
        numbers.add(7);
        System.out.println(numbers);


        List<Integer>newList=new ArrayList<>();

        for (int i = 0; i <numbers.size() ; i++) {
            if(!newList.contains(numbers.get(i))){
                newList.add(numbers.get(i));

            }
        }
        System.out.println("newList = " + newList);
    }


    public static void getOnceAllElements(List<Integer>list){

        List<Integer>newNums=new ArrayList<>();

        for(Integer w:list){

            if(!newNums.contains(w)){
                newNums.add(w);
            }
        }
        System.out.println("newNums = " + newNums);
    }


}
