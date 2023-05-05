package do_while_statement;

import java.util.Arrays;
import java.util.Random;

public class Q02_APartOfMiniProjectLogicOfDoWhile {
    public static void main(String[] args) {

        int[] arr = new int[6];

        int randomNumber1 = 0;
        Random random = new Random();

        boolean isRepeated;



        System.out.println("****** when it is true with condition and with break********");
        //when while is false do while loop will be broken. Go to for loop

        for (int i = 0; i < 6; i++) {
            System.out.println("i outside do while = " + i);

            do {
                isRepeated = false;

                randomNumber1 = random.nextInt(8) + 1;
                System.out.println("randomNumber1 = " + randomNumber1);

                for (int j = 0; j < i; j++) {
                    if (arr[j] == randomNumber1) {// while if part does not run True, go to while(isRepeated)
                        isRepeated = true;
                        System.out.println("isRepeated in if of inner for = " + isRepeated);
                        break;  // it breaks to inner for loop
                    }
                    System.out.println("i in inner for loop of do while = " + i);
                    System.out.println("j in inner for loop of do while = " + j);

                }


            } while (isRepeated);// when this part is false, go outside do while loop, for loop will be started

           arr[i] = randomNumber1;
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        }
    }
}
