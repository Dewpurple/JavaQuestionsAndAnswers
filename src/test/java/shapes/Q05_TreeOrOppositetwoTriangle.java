package shapes;

public class Q05_TreeOrOppositetwoTriangle {
    //Half diomand
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    // * * * * * *
    //* * * * * * *
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



        }
    }

