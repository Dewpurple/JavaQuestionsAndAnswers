package shapes;

public class Q06_DiomandShape {
    /*
    diomand shape
     */
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            for (int j = i; j < 7; j++) {
                System.out.print(" ");//for * and space
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 7  ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = i; k < 7 ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }





    }

}