package loops;

public class Q011_Multiplication {
    /*
    Type code to find the multiplication of the integers from 3 to 9
     */
    public static void main(String[] args) {

        int multiplication=1;
        for (int i = 3; i <10 ; i++) {
            multiplication*=i;
        }

        System.out.println(multiplication);

    }
}
