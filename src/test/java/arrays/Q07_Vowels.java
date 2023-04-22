package arrays;

public class Q07_Vowels {

    /*
    Find the number of vowels in a String
     */
    //a,e,i,o,u
    public static void main(String[] args) {


        String s = "Apex is an object oriented programming language";
        String[] newS = s.toLowerCase().split("");

        int count=0;
        for (String w : newS) {
        //    System.out.println(w);
            if (w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u")) {
                count++;
            }


        }
        System.out.println("count = " + count);
    }
}