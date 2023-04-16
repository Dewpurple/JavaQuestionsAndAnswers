package loops;

public class Q04SumOfDigits {
    public static void main(String[] args) {

        int num=75389;
        int sumOfDigits=0;

        for (int i = num; i >0 ; i/=10) {
            //      75389>0==>  75389/10=7538
            //       7538>0==>  7538/10=753
            //        753>0==>   753/10=75
            //         75>0==>    75/10=7
            //         7>0==>      7/10=0
            //         0>0==> false

            sumOfDigits+=i%10;// 75389%10=9
                                //7538%10=8
                                //753%10=3
                                //75%10=5
                                //7%10=7
        }

        System.out.println("sumOfDigits = " + sumOfDigits);
    }
}
