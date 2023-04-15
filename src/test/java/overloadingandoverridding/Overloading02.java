package overloadingandoverridding;

public class Overloading02 {
    public static void main(String[] args) {

        System.out.println(add(8, 9));//000
        System.out.println(add(8, 9.0));//(8+9.0)*2=34.0
        System.out.println(add(9, 3.2f));//(9+3.2)*2=24.40000009536743
        System.out.println(add(99, 3338889998l));//000
    }


    public static double add(int a, double b){
        return (a+b)*2;
    }

    public static String add(int a,long b){
        return ("000");
    }
}
