package loops;

public class Q012_FromChar_C_to_A {
    /*
    Type code to print characters from 'C' to 'A' on the console
     */
    public static void main(String[] args) {

        System.out.println("*******with for loop ******");
        for (char i = 'C'; i >='A' ; i--) {
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("*******with do while without box ******");

        char ch='C';
        do{

         System.out.print(ch + " ");//C B A

            ch--;


        }while (ch>='A');



        System.out.println();
        System.out.println("*******with do while with a box ******");

        char c='C';
        String b="";
        do{


          b+=c+ " ";

            c--;

        }while (c>='A');
        System.out.println(b);


    }
}
