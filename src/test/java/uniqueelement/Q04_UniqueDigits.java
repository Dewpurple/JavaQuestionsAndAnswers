package uniqueelement;

public class Q04_UniqueDigits {
    /*
    Type code to print the unique digits in an integer. Example; 223878 ⇒ 37
     */
    static int example=2238789;

    public static void main(String[] args) {

        String uniqueStr = String.valueOf(example);
        String b = "";
        for (int i = 0; i < uniqueStr.length(); i++) {
            if (uniqueStr.indexOf(uniqueStr.charAt(i)) == uniqueStr.lastIndexOf(uniqueStr.charAt(i))) {
                b += uniqueStr.charAt(i);
            }
        }
        System.out.println(b + " this result is a string for uniques");
        int uniquefromExample = Integer.valueOf(b);
        System.out.println(uniquefromExample + " this result is an integer for uniques");

        System.out.println();
        System.out.println(" ******with  do while loop *******");

        String box = "";


        String uniqueWthDoWhile = String.valueOf(example);

        int k = 0;
        do {

            if (uniqueWthDoWhile.indexOf(uniqueWthDoWhile.substring(k, k + 1)) == uniqueWthDoWhile.lastIndexOf(uniqueWthDoWhile.substring(k, k + 1))) {
                box += uniqueWthDoWhile.substring(k, k + 1);
            }
            k++;
        } while (k < uniqueWthDoWhile.length());

        System.out.println(box);


    }


}
