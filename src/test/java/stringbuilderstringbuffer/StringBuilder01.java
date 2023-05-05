package stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

        System.out.println("*******first no assign any element or value it is Empty *******");
        StringBuilder sb0=new StringBuilder();
        System.out.println("sb0.length() = " + sb0.length());//0
        System.out.println("sb0.capacity() = " + sb0.capacity());//16

        System.out.println("*******First Empty After append 123456*******");
        sb0.append("123456");
        System.out.println("sb0.length() = " + sb0.length());//6
        System.out.println("sb0.capacity() = " + sb0.capacity());//16

        System.out.println("*******123456 + again append 789*****");
        sb0.append("789");
        System.out.println("sb0.length() = " + sb0.length());//9
        System.out.println("sb0.capacity() = " + sb0.capacity());//16

        System.out.println("*******123456 + again append 789 + append +6 more******");
        sb0.append("aaaaaa");
        System.out.println("sb0.length() = " + sb0.length());//15
        System.out.println("sb0.capacity() = " + sb0.capacity());//16

        System.out.println("*******precedent value is 15 +2 more*******");
        sb0.append("aa");
        System.out.println("sb0.length() = " + sb0.length());//17
        System.out.println("sb0.capacity() = " + sb0.capacity());//16+16+2


        System.out.println("*********give capacity as numbers **********");
        StringBuilder sb1=new StringBuilder(6);
        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println("sb1.capacity() = " + sb1.capacity());//6

        System.out.println("*******after give capacity assign a value 123456*********");
        sb1.append("123456");
        System.out.println("sb1.length() = " + sb1.length());//6
        System.out.println("sb1.capacity() = " + sb1.capacity());//6


        System.out.println("*****Direct Assign a value ****** ");
        StringBuilder sb2=new StringBuilder("Jacksonville");

        System.out.println("sb2.length() = " + sb2.length());//12
        System.out.println("sb2.capacity() = " + sb2.capacity());//28


        System.out.println("*****first index LAst index****** ");
        System.out.println("sb2 = " + sb2);//Jacksonville
        System.out.println("sb2.indexOf(\"l\") = " + sb2.indexOf("l"));//9
        System.out.println("sb2.lastIndexOf(\"l\") = " + sb2.lastIndexOf("l"));//10

        System.out.println("***************");
        StringBuilder sb3=new StringBuilder("Misaasissippi");

        System.out.println("sb3.lastIndexOf(\"a\",4) = " + sb3.lastIndexOf("a", 4));//4 Misaa
        System.out.println("sb3.lastIndexOf(\"s\",3) = " + sb3.lastIndexOf("s", 3));//2 Mis
        System.out.println("sb3.lastIndexOf(\"s\",8) = " + sb3.lastIndexOf("s", 9));//8 Misaasissi


    }

}
