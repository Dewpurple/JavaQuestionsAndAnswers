package arrays.multidimensionalarrays;

public class Q05_FindMaxElementInMdArray {

    //Find the maximum element in 2 dimensional array
    public static void main(String[] args) {

        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };

        int max=1;
        for(int [] w:a){
            System.out.println("w.length = " + w.length);//2 2 3
           max= Integer.max(max, w.length);
        }
        System.out.println("max element  = " + max);//3
    }
}
