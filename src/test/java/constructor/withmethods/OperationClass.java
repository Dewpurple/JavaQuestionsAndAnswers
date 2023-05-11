package constructor.withmethods;

public class OperationClass {

    int a;
    int b=10;
    int c;
    int d;
    int f;
    String s="Purple";

    public OperationClass(String str){

    }
    public OperationClass() {
        a=90;
    }

    public OperationClass(int b) {
        this.b=100;
        f=1000;
    }

    public OperationClass(int c, int d) {
        this.c = c;
        this.d = d;
    }
    public OperationClass(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int multiplication(){
        return c*d;
    }

    public int add(){
        return c+d;
    }

    public int subtraction(){
        return a-2;
    }

    public int division(){
        return b/2;
    }

    public int add1000(){
        return f+1000;
    }

    public String introduction(String a){
        return "Hello " +a;
    }

    public static void main(String[] args) {

        System.out.println("*******no parameter constructor**********");
        OperationClass m2= new OperationClass();
        System.out.println("subtraction no parameter==>" +m2.subtraction());

        System.out.println("*******no parameter constructor**********");
        OperationClass m3=new OperationClass();
        System.out.println("m3 division no parameter==>" +m3.division());

        System.out.println("*******no parameter constructor**********");
        OperationClass m33=new OperationClass();
        System.out.println("m33.add1000() = " + m33.add1000());


        System.out.println("*******one int parameter constructor**********");
        OperationClass m4=new OperationClass(20);
        System.out.println("division With 20 one parameter==>" +m4.division());
        System.out.println("m4.add() = " + m4.add());
        System.out.println("m4.subtraction() = " + m4.subtraction());
        System.out.println("m4.add1000() = " + m4.add1000());

        System.out.println("*******2 parameter constructor**********");
        OperationClass m1=new OperationClass(2,3);
        System.out.println("multiplication 2 parameter==> "+m1.multiplication());

        System.out.println("*******2 parameter constructor*******");
        System.out.println("add 2 parameter==> " +m1.add());

        System.out.println("*******String name **********");
        OperationClass m5=new OperationClass("Deep Blue");
        System.out.println("String name with parameter==> "+m5.s);
        System.out.println("m5.introduction() = " + m5.introduction("White"));
    }
}
