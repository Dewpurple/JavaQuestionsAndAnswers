package apex.variables;

public class V03 {

    //        Type a code to find simple interest.
    //       hint: Simple interest formula = principal * rate * numberOfYear / 100


    public static void main(String[] args) {
        System.out.println(simpleInterest());
    }
    public static double simpleInterest() {

        int principal = 1000;
        double rate = 6;
        int numberOfYear=6;

        double simpleInterestFormula = principal * rate*6 / 100;

    return simpleInterestFormula;
    }

}
