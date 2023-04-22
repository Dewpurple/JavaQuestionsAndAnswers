package arrays;

public class Q05_TotalNumbersOfCharactersString {

    /*
    Find the total number of characters used in String array elements
    Example: { "Tyler", "Jonathan", "Mark", "Angie", "Vince" } ==> Output is 27
     */

    public static void main(String[] args) {
        String[] b = {"Tyler", "Jonathan", "Mark", "Angie", "Vince"};

        int sum=0;
        for (String w:b){

            sum+=w.length();
        }

        System.out.println("sum = " + sum);
    }
}
