package arrays;

public class Q18_SumIsGivenNumber {

    /*
        Create a method and
		 from a given array find all pairs whose sum is a given number,
		 {4,6,5,-10,8,5,20} ===> 10
		 4 + 6 = 10
        5 + 5 = 10
       -10 + 20 = 10
		 */


    public static void main(String[] args) {
        int array [] = {4,6,5,-10,8,5,20};

        int sumOfNum=10;
        for (int j = 0; j < array.length ; j++) {
            for (int k = 0; k < array.length ; k++) {

                if(array[j]+array[k]==sumOfNum){
                    System.out.println(array[j] + "+" + array[k] + "= 10" );
                }
            }
        }
        System.out.println();
        System.out.println("********** 2.way**********");

        int i=0;
        int sum=10;
        do{

            for (int l = 0; l <array.length ; l++) {
                if(array[i]+array[l]==sum){
                    System.out.println(array[i]+ "+"+ array[l]+ "=10" );
                }
            }
            i++;
        }while (i<array.length);


    }
}
