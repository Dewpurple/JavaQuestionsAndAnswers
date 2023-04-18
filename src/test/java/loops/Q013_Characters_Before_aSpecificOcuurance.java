package loops;

public class Q013_Characters_Before_aSpecificOcuurance {

    /*
    Type all characters before the first occurrence of 'm' in a String
     */

    public static void main(String[] args) {

        String str= "Christmas";

       int indexOfM= str.indexOf("m");
       String box="";
       for (int i = 0; i <indexOfM ; i++) {

           box+=str.charAt(i);

        }
        System.out.println(box);


        System.out.println();
        System.out.println("********2.Way *********");

        String s= "Christmas";
        String b="";
        for (int i = 0; i <s.length() ; i++) {

           if(s.substring(i,i+1).equals("m")){
               break;
           }
            b+=s.substring(i,i+1);
        }

        System.out.println(b);


    }
}
