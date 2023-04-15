package overloadingandoverridding;

public class Overloading03 {

    public static void main(String[] args) {

        // int x= add(8, 9);//error
        double y = add(8, 9.0);//(8+9.0)*2=34.0
        System.out.println(y);
        //  float z=add(9, 3.2f);//error
        //  long w= add(99, 3338889998l);//error

        String str = add("123", "456");
        System.out.println(str);//123-456

        String str1 = add(1111, 3) + add(8999);
        System.out.println(str1);//***-***-8999
    }

    private static String add(String s, String s1) {
        return s +"-"+ s1;
    }

    public static double add(int a, double b) {
        return (a + b) * 2;
    }

    public static String add(int a, long b) {
        return ("***-***-");
    }

    public static int add(int a) {
        return a ;
    }
}
