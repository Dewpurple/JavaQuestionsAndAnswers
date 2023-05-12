package apex.variables;

public class V06 {
    float bookP;
    float notebookP;
    float laptopP;

      /*
        Create 3 float variables for the price of a book, notebook, and laptop.
        Print the total price of 2 books, 4 notebooks and 3 laptops on the console
         */

    public static void main(String[] args) {
        System.out.println(ttlPrice(12.85f, 1.75f, 1000.00f, 2, 4, 3));
    }

    public static float ttlPrice(float bookP,float notebookP,float laptopP,int books,int nbooks,int laptops){

        float multiply=(bookP*books) + (notebookP*nbooks) + (laptopP*laptops);

        return multiply;

    }

}
