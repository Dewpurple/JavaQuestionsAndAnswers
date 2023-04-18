package loops;

public class Q014_SumOfDigits_anIntegerNumber {
    /*
    Type code to find the sum of the digits in an integer
     */
    public static void main(String[] args) {

        int num=753;

        int sum=0;
        for (int i = num; i >0 ; i/=10) {

            sum+=i%10;
        }

        System.out.println(sum);


    }
}
