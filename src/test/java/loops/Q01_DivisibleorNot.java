package loops;

public class Q01_DivisibleorNot {
    /*
    Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
    with a space between two consecutive integers
     */
    public static void main(String[] args) {
        //1.way
        String container="";
        for (int i = 120; i >10 ; i--) {
            if(i%4==0 && i%6==0){
                container+=i+ " ";
            }
        }

        System.out.println(container + " is/are divisible by 4 and 6");

        System.out.println();
        System.out.println(" ***** 2.way with while loop ********");
        //2.way
        String c="";
        int i=120;
        while(i>10){
            if(i%4==0 && i%6==0){
                c+= i+ " ";
            }
            i--;

        }
        System.out.println(c + " is/are divisible by 4 and 6");

        System.out.println();
        System.out.println(" ***** 3.way with do while loop ********");

        int k=120;
        String b="";
        do{
            if(k%4==0 && k%6==0){
                b+= k+ " ";
            }

            k--;
        }while(k>10);

        System.out.print(b+ "is/are divisible by 4 and 6 ");


    }
}
