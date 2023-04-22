package arrays;

public class Q17_LengthOfElementsEvenOrOdd {
/*
 //Create a String array whose elements are : Alan, John, ALAN, Brad, Mary, Angie,BUNNY
 //print the elements whose indexes are even on the console

 */
    public static void main(String[] args) {
        String s [] = {"Alan", "John", "Tasmania", "Brad", "Mary", "BUNNY"};

        for(String w:s){
            if(w.length()%2==0){
                System.out.print("\n: Even Length: \n:"+w + " ");
            }else {
                System.out.println();
                System.out.print("\n:Odd Length: \n:" +w+ " ");
            }
        }
    }
}
