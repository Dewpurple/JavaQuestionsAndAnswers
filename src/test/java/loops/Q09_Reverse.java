package loops;

public class Q09_Reverse {

    /*
    Type code to reverse a String. Example; Mark ==> kraM
     */
    public static void main(String[] args) {

        String name="Mark";

        String box="";
        for (int i =name.length()-1; i >=0 ; i--) {
            box+=name.charAt(i);

        }

        System.out.println(box);


    }
}
