package do_while_statement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q03_AnotherLogicForDoWhile {

    public static void main(String[] args) {

        int randomNumForUser;
        List<Integer> userNums = new ArrayList<>();
        Random random=new Random();


        for (int i = 0; i < 6; i++) {//0/1
            System.out.println("i = " + i);

            do {//0/0
                randomNumForUser = random.nextInt(6)+1;
                System.out.println("randomNumForUser = " + randomNumForUser);//8(0) 12(1) 12(2) 10(2) 10(3) 1(3) 8(4) 4(4)

                if (!userNums.contains(randomNumForUser)) {//t
                    userNums.add(randomNumForUser);//[8,12] [8,12,10][8, 12, 10, 1]
                 break;//12(2)  break will break to do while loop

                }

                //   System.out.println(  "userNums1" + userNums);

                //   System.out.println("c = " + c);
            } while (true);
            //    System.out.println("c = " + c);
        }
    }
}
