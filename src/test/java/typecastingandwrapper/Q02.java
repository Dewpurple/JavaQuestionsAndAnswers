package typecastingandwrapper;

public class Q02 {

    public static void main(String[] args) {
        short age=12;
        int newAge=age;

        System.out.println(newAge + " short ==>type casting ==> int");

        System.out.println();
        System.out.println("************");

        long a=12l;
        int newA=(int)a;
        System.out.println("long ==> type casting==> int = " + a);

        System.out.println();
        System.out.println("************");

        double price=12.99;
        float newPrice=(float)price;

        System.out.println("newPrice doble==> type casting float= " + newPrice);

        System.out.println();
        System.out.println("************");

        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        System.out.println();
        System.out.println("*****ValueOf and parseOf ****");
//        parseOf returns===> primitive, static method, after java 1.5 version u can use it as non primitive data type as well
//        valueOf returns===> non primitive, instance method

        String s="900";
        Integer snewValueOfInt= Integer.valueOf(s);
        int newsparseOfint= Integer.parseInt(s);

        System.out.println("snewValueOfInt = " + snewValueOfInt);
        System.out.println("newsparseOfint = " + newsparseOfint);

        String st="12345678";
        double newstParseDouble=Double.parseDouble(st);
        long newstParseLong=Long.parseLong(st);
        Double newstValueOfDouble=Double.valueOf(st);
        Long newstValueOfLong =Long.valueOf(st);

        System.out.println("newstParseDouble = " + newstParseDouble);
        System.out.println("newstParseLong = " + newstParseLong);
        System.out.println("newstValueOfDouble = " + newstValueOfDouble);
        System.out.println("newstValueOfLong = " + newstValueOfLong);

    }
}
