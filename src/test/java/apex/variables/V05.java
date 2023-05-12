package apex.variables;

public class V05 {
    //        Create two boolean variables whose values are different and print their values in the same
    //        line with a space between two consecutive values.

    public static void main(String[] args) {
        System.out.println(twoBooleanConsecutive(true, false));
    }

    public static String twoBooleanConsecutive(boolean t,boolean f){

        String sumOfBoolean=t + " & " +f;
        return sumOfBoolean;
    }
}
