package loops;

public class Q03_Palindrome {
    /*
    Type code to check whether a String is palindrome or not. If a String is the same with its
    reverse then it is called palindrome. For example; “anna”, “123321” are palindromes
     */

    public static void main(String[] args) {

        String s="123321";
        String b="";
        for (int i = s.length()-1; i >=0 ; i--) {
            b+=s.charAt(i);

        }

        if(s.equals(b)){
            System.out.println(" this is palindrome");
        }else{
            System.out.println(" not palindrome");
        }


        System.out.println();
        System.out.println("******* 2. way with while loop *********");

        String st="anna";
        String c="";

        int j=st.length()-1;

        while(j>=0){

            c+=st.charAt(j);
            j--;

        }

        if(st.equals(c)){
            System.out.println("this palindrome");
        }else{
            System.out.println("this is not palindrome");
        }



    }
}
