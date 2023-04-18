package shapes;

public class Q02_TriangleShapesWithA {

    /*
    Type code to draw the following image by using a for loop.
    A
    A A
    A A A
    A A A A
     */
    public static void main(String[] args) {


        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }
    }
}
