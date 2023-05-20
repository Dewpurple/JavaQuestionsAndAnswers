package apex.loops.forloop;

public class Q03_Palindrome_CaseSensitive {

    public static void getReverseName(String name){

        String cont="";
        for (int i = name.length()-1; i >=0 ; i--) {
            String nameIdx=name.substring(i,i+1);

            cont+=nameIdx;
        }

        System.out.println("cont = " + cont);

        if(name.equals(cont)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        getReverseName("noon");
    }
}
