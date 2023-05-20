package apex.loops.forloop;

public class Q02_RepeatedElements {

    /*
    Type code to print repeated characters in a String. For example; accessories ⇒ ces
     */

    public static void checkRepeatedElements(String s){

        String cont ="";
        for (int i = 0; i <s.length() ; i++) {
            String sIdx=s.substring(i,i+1);

            if(s.indexOf(sIdx)!=s.lastIndexOf(sIdx)){
                if(!cont.contains(sIdx)){
                    cont+=sIdx;
                }
            }

        }

        System.out.println("cont = " + cont);
    }

    public static void main(String[] args) {
        checkRepeatedElements("accessories");
    }
}
