package ternarystatement;

public class Q05_MinIntegers {

    public static void main(String[] args) {
        getMinumumValue(1000,950);
        getMinumumValuewithMath(1000,950);
        getMaxValuewithMath(1000,950);
    }


    public static int getMinumumValue(int a, int b){

        String greaterNum =a>b     ?   "first number is greater than second number"        :  "second number is greater than first number";
        System.out.println("greaterNum = " + greaterNum);
        return a;
    }

    public static int getMinumumValuewithMath(int a, int b){

        int min= Math.min(a,b);
        System.out.println("min = " + min);
        return a;
    }

    public static int getMaxValuewithMath(int a, int b){

        int max= Math.max(a,b);
        System.out.println("max = " + max);
        return a;
    }
}
