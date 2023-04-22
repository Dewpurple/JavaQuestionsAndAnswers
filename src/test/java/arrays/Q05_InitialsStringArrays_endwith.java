package arrays;

public class Q05_InitialsStringArrays_endwith {
    /*
        Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
    Example: { "Kevin", "Jonathan", "Mark", "Angie", "Van" } ==> Output is KJM
     */

    public static void main(String[] args) {


        String[] b = {"Kevin", "Jonathan", "Mark", "Angie", "Van"};

        for (String w : b) {
           if(w.endsWith("n") || w.endsWith("k")){
                System.out.println("w.charAt(0) = " + w.charAt(0));
            }else{
               System.out.println("w = " + w);
           }
        }


    }
}
