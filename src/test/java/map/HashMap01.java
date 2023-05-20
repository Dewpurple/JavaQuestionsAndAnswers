package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {
        /*
Create a MAP that will have the following keys and values
        Maths = 9
        English = 8
        Persian = 7
        Turkish = 6
        French = 7
        Then print all courses that have scores over 7
 */

        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("Maths", 9);
        courses.put("English", 8);
        courses.put("Persian", 7);
        courses.put("Turkish", 6);
        courses.put("French", 7);

        System.out.println("courses = " + courses);

        //1.way;
        Map<String, Integer> higherSevenPoint = new HashMap<>();

        for (Map.Entry<String, Integer> w : courses.entrySet()) {
            if (w.getValue() > 7) {
                higherSevenPoint.put(w.getKey(), w.getValue());
            }
        }
        System.out.println("higherSevenPoint = " + higherSevenPoint);

        System.out.println();
        System.out.println("***** 2.way *******");

        Set<Map.Entry<String, Integer>> higherSeven = courses.entrySet();
        for (Map.Entry<String, Integer> w : higherSeven) {
            if (w.getValue() > 7) {
                System.out.println("w.getValue() = " + w.getValue());
            }
        }

        System.out.println();
        System.out.println("***** 3.way *******");

        Collection<Integer> valueOfCourses = courses.values();
        System.out.println("valueOfCourses = " + valueOfCourses);
        int flag = 0;
        for (Integer w : valueOfCourses) {
            if (w > 7) {
                System.out.println("greater than 7  " + w);
                flag++;
            }

        }

        if(flag>0){
            System.out.println(flag + " course/s is/are greater than 7");
        }

        System.out.println();





//        System.out.println();
//        System.out.println("***** only get key values *******");
//        Set<String> keyOfCourses=courses.keySet();
//        for(String w:keyOfCourses){
//            System.out.println("keyOfCourses.size() = " + keyOfCourses.size());
//            System.out.println("keyOfCourses = " + keyOfCourses);
//        }
    }
}

