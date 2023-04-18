package loops;

import java.util.Scanner;

public class Q018_CountTheNumberOfChractersFromFirsttoLast {
        /*
        Get a String and a character from user
        Count the number of characters between the first occurrence and the last occurrence of the
        given character in the String
        Do not count the space characters
        If the character which user selected is displayed just once in the String return -1
        If the character which user selected does not exist in the String return -1
        For example; "Java is easy" - 'a' ==> 5
        "Java is easy" - 'w' ==> -1
        "Java is easy" - 'e' ==> -1
 */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String withoutSpace=input.nextLine().replaceAll(" ","").trim();

        System.out.println("Enter a letter");
        String l=input.nextLine().trim();

        int count=0;
        int b=0;
        for (int i = 0; i <withoutSpace.length() ; i++) {

            if(withoutSpace.substring(i,i+1).equals(l)) {
                 withoutSpace.substring(i, i + 1);

                count++;

                System.out.println("count = " + count);
            }

        }

        if(count>1){
            System.out.println(count + " times included");
        }else if(count==1){
            System.out.println("there is once, so result is -1");
        }else {
            System.out.println("There is not in your sentence, and resault is -1");
        }
    }
}
