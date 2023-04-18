package loops;

public class Q07_Asterix_With_Letters_inAName {

    /*
    Type code to print all lowercase characters in a String with an asterix.
    For example; 'Tom Hanks?' ==> o*m*a*n*k*s
     */
    public static void main(String[] args) {

        String name= "Tom Hanks";

        String box="";
        String withoutInitials=name.replaceAll("[^a-z]","");
        for (int i = 0; i <withoutInitials.length() ; i++) {
           box+=withoutInitials.charAt(i)+"*";
        }
        System.out.println( box);


    }
}
