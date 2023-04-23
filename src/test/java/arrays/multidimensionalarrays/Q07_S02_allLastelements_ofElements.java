package arrays.multidimensionalarrays;

public class Q07_S02_allLastelements_ofElements {

    /*
    Find the product of the last elements in the array elements of the
    given multi dimensional array { {91,92,93}, {94,95}, {96} }
     */

    public static void main(String[] args) {
        int [][]md_arr={ {91,92,93}, {94,95}, {96} };

        for(int [] w:md_arr){
            System.out.println("w.length = " + w.length);//3 2 1

            System.out.println("w[w.length-1] = " + w[w.length - 1]);//93 95 96
        }


    }
}
