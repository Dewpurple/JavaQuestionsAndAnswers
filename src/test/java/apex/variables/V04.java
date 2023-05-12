package apex.variables;

import java.util.stream.IntStream;

public class V04 {

    /*
   Create a String and two Long variables. Print the sum and the multiplication of the long
   variables with the String on the console.
    */
    String name;
    long l1;
    long l2;

    public static void main(String[] args) {
        System.out.println(sumOfLongVariable("Merlin", 100, 123456789L));
        System.out.println(multiplicationOfLongVariable("Pati", 100, 1234567L));


    }

    public static String sumOfLongVariable(String str, long l1, long l2) {
        long sum = l1 + l2;

        String newS = sum + " " + str;
        return newS;
    }

    public static String multiplicationOfLongVariable(String str, long l1, long l2) {
        long multiplication = l1 * l2;

        String newS = multiplication + " " + str;
        return newS;
    }



}
