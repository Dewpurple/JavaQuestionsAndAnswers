package ifstatement;

public class Q05_Triangle {
/*
    Type code to print
    a) "Isosceles Triangle" if two sides of a triangle are equal in length.
    b) "Equilateral Triangle" if all sides of a triangle are equal in length.
    c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
    int a
 */
    public static void main(String[] args) {

        int a=19,b=29,c=9;

        boolean isoscelesTriangle= (a==b && b!=c) || (b==c && a!=b) ||(a==c && a!=b) ;//if it returns true, condition will be true and ISOSCELES
        boolean equilateralTriangle=( a==b && a==c) || (b==c && a==b);//if it returns true, condition will be true and EQILATERAL

//        System.out.println("isoscelesTriangle = " + isoscelesTriangle);
//        System.out.println("equilateralTriangle = " + equilateralTriangle);

        if(isoscelesTriangle){
            System.out.println(" This triangle is Isosceles");
        }else if(equilateralTriangle){
            System.out.println(" This triangle is Equilateral");
        }else{
            System.out.println(" This triangle is neither Isosceles nor Equilateral");
        }

    }
}
