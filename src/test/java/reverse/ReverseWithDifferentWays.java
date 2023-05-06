package reverse;

import java.util.Arrays;

public class ReverseWithDifferentWays {

    // Write a program to reverse the order of words .
    public static void main(String[] args) {
        getReverseWithString();
        getReverseWithStringArrays();
        getReverseWithCharArrays();

        System.out.println("getReverseWithStringBuilder() = \n" + getReverseWithStringBuilder());

    }

    public static void getReverseWithString() {
        System.out.println("**********String ***********");
        String s = "Hello world! Welcome to Java programming.";
        String c = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            c += s.charAt(i);
        }
        System.out.println("c = " + c);
    }

    public static void getReverseWithStringArrays() {
        System.out.println("**********by using String Arrays***********");
        String input = "Hello world! Welcome to Java programming.";
        System.out.println("input.length() = " + input.length());
        String[] str = input.split("");

        String cont = "";
        int idx=0;
        String [] newStr=new String[str.length];
        for (int i = str.length - 1; i >= 0; i--) {
            cont += str[i];
            newStr[idx]=str[i];
            idx++;
        }
        System.out.println("cont = " + cont);
        System.out.println("Arrays.toString(newStr) = " + Arrays.toString(newStr));
    }

    public static void getReverseWithCharArrays() {
        System.out.println("*********by using Char Arrays**********");
        String st = "Hello world! Welcome to Java programming.";
        char[] chr = st.toCharArray();
            //  char c='\u0000';  //empty char
        char[] chr2 = new char[chr.length];
        int idx=0;
        for (int i = chr.length-1; i >=0 ; i--) {
            chr2[idx]=chr[i];
            idx++;

        }
        System.out.println("Arrays.toString(chr2) = " + Arrays.toString(chr2));

    }


    public static StringBuilder getReverseWithStringBuilder() {
        System.out.println("\n************by using String Builder************\n");
        String input = "Hello world! Welcome to Java programming.";
        StringBuilder sb01 = new StringBuilder();
        sb01.append(input);
        for (int i = sb01.length() - 1; i >= 0; i--) {
            sb01.append(sb01.charAt(i));
        }
        return sb01;

    }

}
