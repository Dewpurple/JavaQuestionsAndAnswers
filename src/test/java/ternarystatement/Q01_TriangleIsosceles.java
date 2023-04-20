package ternarystatement;

public class Q01_TriangleIsosceles {

    /*
    Use ternary to print
    a) "Isosceles Triangle" if two sides of a triangle are equal in length.
    b) "Equilateral Triangle" if all sides of a triangle are equal in length.
    c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
     */

    public static void main(String[] args) {
          getTriangleResult(1113,2113,113);
    }

    public static int getTriangleResult(int a, int b, int c){

//            if((a==b || a==c) && (b!=c) ) {
//                System.out.println("Isosceles Triangle");
//            }else if((b==c)  && (a!=c) ) {
//            System.out.println("Isosceles Triangle");
//            }else if(a==b && b==c && a==c) {
//                System.out.println("Equilateral Triangle");
//            }else{
//                System.out.println("Neither isosceles, nor equilateral");
//            }

        String s=
                (a==b || a==c) && (b!=c)  ?
                        "Isosceles Triangle"
                        :  (b==c)  && (a!=c)   ?  "Isosceles Triangle"     :  (a==b && b==c && a==c) ? "Equilateral Triangle" : "Neither isosceles, nor equilateral";

        System.out.println(s);
        return a;

    }
}
