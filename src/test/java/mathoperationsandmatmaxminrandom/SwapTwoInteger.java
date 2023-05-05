package mathoperationsandmatmaxminrandom;

public class SwapTwoInteger {
    public static void main(String[] args) {
        int num1= 10;
        int num2=20;

        //1.way

//        int num3=num1;//10
//        num1=num2;//20
//        num2=num3;//10
//
//        System.out.println("num2 = " + num2);
//        System.out.println("num1 = " + num1);
//

        System.out.println();
        System.out.println("************");
        //2.way

        int num11=10;
        int num22=20;

//num11=10  num22=20
        num11= num11+num22;//30
        num22=num11-num22;//10

        num11=num11-num22;//20

        System.out.println("num11 = " + num11);
        System.out.println("num22 = " + num22);
    }
}
