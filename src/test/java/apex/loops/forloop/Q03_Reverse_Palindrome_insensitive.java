package apex.loops.forloop;

public class Q03_Reverse_Palindrome_insensitive {

    public static void getReverse(String name){
        String cont="";

        String sReverse =
                name.toLowerCase().replaceAll("\\p{Punct}","").replaceAll(" ","");
        System.out.println("sReverse = " + sReverse);

        for (int i = sReverse.length()-1; i >=0 ; i--) {
           String sRev2= sReverse.substring(i,i+1);
            cont+=sRev2;
        }

        System.out.println("Reverse : " + cont);

        if(cont.equals(sReverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("It is not Palindrome");
        }
    }

    public static void main(String[] args) {
        getReverse("Was it a car or a cat I saw? ");
    }


}
