package stringbuilderstringbuffer;

public class Sb01 {
    /*
            What is the result of that code?
            A. abbaaccc
            B. abbaccca
            C. bbaaaccc
            D. An exception is thrown
            E. The code does not compile.
             */
    public static void main(String[] args) {

        System.out.println("**********INSERT**************");

        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        //aaa
        //abbaa
        //abbaccc

        System.out.println("*********Are String and StringBuilder Equal or not*********");

         /*
        A. 1
        B. 2
        C. 12
        D. No output is printed
        E. Gives error
         */
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");

        // if(s1 == s2){
        //   System.out.println("1");
        //  }
//         if(s1.equals(s2)){
//         System.out.println("2"); }


        System.out.println("*********Substring with SB*********");

        StringBuilder numbers = new StringBuilder("012345678");
        System.out.println(numbers.substring(1,3)); //12
        System.out.println(numbers.substring(7,7));//empty
        System.out.println(numbers.substring(7));//78
    }
}

