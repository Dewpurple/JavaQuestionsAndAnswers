package apex.loops.forloop;

public class Q01 {

    /*
    Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
    with a space between two consecutive integers
     */

    public static void divisibleBySpecificNumbers(int num1,int num2){
        for (int i = 120; i >10 ; i--) {
            if(i%num1==0 && i%num2==0){
                System.out.print(i+ " ");
            }
        }
    }

    public static void main(String[] args) {
        divisibleBySpecificNumbers(4,6);
    }
}
