package loops;

public class Q02_RepeatedCharactersinString {
  //  Type code to print repeated characters in a String. For example; accessories ⇒ ces

    public static void main(String[] args) {

        System.out.println();
        System.out.println(" ****** 1.way with for loop***********");
    String str= "accessories";

        String c="";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))){// substring method can also be used.
                if(!c.contains(str.substring(i,i+1))){// contains method should be string
                    c+=str.charAt(i) + " ";//substring method can also be used
                }
            }

        }

        System.out.println(c);

        System.out.println();
        System.out.println(" ****** 2.way with while loop***********");

        String st= "accessories";
        String m="";
        int i=0;
        while(i<st.length()){
            if(st.indexOf(st.substring(i,i+1))!=st.lastIndexOf(st.substring(i,i+1))){
                if(!m.contains(st.substring(i,i+1))){
                    m+=st.substring(i,i+1)+ " ";
                }
            }

            i++;

        }
        System.out.println(m + " result of repeated characters with while loop ");


        System.out.println();
        System.out.println(" ****** 3.way with do while loop***********");

        String s= "accessories";

        int j=0;
        String b="";
        do{
            if(s.indexOf(s.charAt(j))!=s.lastIndexOf(s.charAt(j))){
                if(!b.contains(s.substring(j,j+1))){
                    b+=s.charAt(j)+ " ";
                }
            }
            j++;
        }while(j< s.length());
        System.out.println(b+ " result of repeated characters with do while loop");

    }
}
