package convertcharstringarrayslistmap;

import java.util.*;

public class StringtoArrayListtoSet {

    public static void main(String[] args) {
        //        Type code to print different characters used in a String
        //        Example: 'Mississippi' ====> Misp

        String str = "Mississippi";

        convertStringtoArrayList(str);
        convertStringLinkedHasSet(str);

    }

        public static void convertStringtoArrayList(String str) {
        System.out.println("*********** 1.way ***********");

        String [] sArr= str.split("");
        List<String> lsArr= Arrays.asList(sArr);
        LinkedHashSet <String> setlsArr=new LinkedHashSet<>(lsArr);
        System.out.println("setlsArr = " + setlsArr);//[M, i, p, s]
    }

    public static void convertStringLinkedHasSet(String str) {
        System.out.println("*********** 2.way ***********");

        String [] sArr= str.split("");
        Set<String> setsArr=new LinkedHashSet<>(Arrays.asList(sArr));
        System.out.println("setsArr = " + setsArr);

    }
    }

