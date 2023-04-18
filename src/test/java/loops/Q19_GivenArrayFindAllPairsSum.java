package loops;

public class Q19_GivenArrayFindAllPairsSum {
    /*
    From a given array find all pairs whose sum is a given number.
    If the array is {4, 6, 5, -10, 8, 5, 20} and the number is 10 then output will be
    4+6=10, 5+5=10, -10+20=10
     */
    public static void main(String[] args) {
      int [] arr= {4, 6, 5, -10, 8, 5, 20} ;


      int box=10;
        for (int i = 0; i < arr.length ; i++) {

            for (int j = i; j <arr.length ; j++) {

                if (box == arr[i] + arr[j]) {
                    System.out.print(+ arr[i]+ "+" + arr[j]+ "=" +box+ " ");


                }

            }



        }
        }
}
