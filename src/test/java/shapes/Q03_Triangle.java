package shapes;

public class Q03_Triangle {
    /*
    Type code to draw the following image by using a for loop.
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

     */
    public static void main(String[] args) {

        for (int i = 6; i >0 ; i--) {
            for (int j = i; j >0 ; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
