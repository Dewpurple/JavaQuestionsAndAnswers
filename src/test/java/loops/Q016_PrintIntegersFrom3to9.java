package loops;

public class Q016_PrintIntegersFrom3to9 {
    /*
    Type code to print integers from 3 to 9 except 5
     */
    public static void main(String[] args) {

        String b="";
        for (int i = 3; i <10 ; i++) {

            if(i==5){
                continue;
            }
            b+=i+ " ";
        }
        System.out.println(b);
    }
}
