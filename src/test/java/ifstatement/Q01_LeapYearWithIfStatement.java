package ifstatement;

public class Q01_LeapYearWithIfStatement {
    public static void main(String[] args) {


        System.out.println();
        System.out.println("********Leap year************");

        int year = 2004;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("This is leap year");
            } else {
                System.out.println("This is not leap year");
            }
        } else if (year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println("This is leap year");
            } else {
                System.out.println("This is not leap year");
            }


        }
    }
}
