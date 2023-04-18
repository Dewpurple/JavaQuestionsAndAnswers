package loops;

public class Q015_Find_ttl_numOfCharFromSpace {

    /*
    Find the total number of characters different from space and punctuation marks in a String
     */

    public static void main(String[] args) {

        String s = " Java is a strongly typed, object-oriented programming language.";
        String newS=s.replaceAll("\\s+","").replaceAll("\\W","").trim();
        System.out.println(newS);

        System.out.println(s.length());
        System.out.println(newS.length());

    }
}
