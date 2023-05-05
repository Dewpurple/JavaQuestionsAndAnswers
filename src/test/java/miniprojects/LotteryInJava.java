package miniprojects;

import java.util.*;

public class LotteryInJava {

    public static void main(String[] args) {
        startTolottery();
    }

    public static void startTolottery() {
        Scanner input = new Scanner(System.in);
        System.out.println("how many lottery numbers you want to see on the console, you should write");
        int lotteryDigits = input.nextInt();

        System.out.println("Enter a min level that the lottery numbers will be start from this ");
        int min = input.nextInt();

        System.out.println("Enter a max level that the lottery numbers are selected until this ");
        int max = input.nextInt();


        if (max - min < lotteryDigits + 9) {
            System.out.println("There must be +10 more than the digits that you have written (lotteryDigits+10) between Max and Min value limits ");

            startTolottery();

        } else {

            Random random = new Random();
            int randomNumForComp;

            List<Integer> computerNums = new ArrayList<>();

            for (int i = 0; i < lotteryDigits; i++) {

                do {
                    randomNumForComp = random.nextInt(max - min) + min;
                    if (!computerNums.contains(randomNumForComp)) {
                        computerNums.add(randomNumForComp);
                        break;
                    }

                } while (true);


            }


            int randomNumForUser;
            List<Integer> userNums = new ArrayList<>();
            for (int i = 0; i < lotteryDigits; i++) {//0/1
                System.out.println("i = " + i);

                do {//0/0
                    randomNumForUser = random.nextInt(max - min) + min;
                    System.out.println("randomNumForUser = " + randomNumForUser);//8(0) 12(1) 12(2) 10(2) 10(3) 1(3) 8(4) 4(4)
                    if (!userNums.contains(randomNumForUser)) {//t
                        userNums.add(randomNumForUser);//[8,12] [8,12,10][8, 12, 10, 1]
                        break;//12(2)

                    }

                 //   System.out.println(  "userNums1" + userNums);

                 //   System.out.println("c = " + c);
                } while (true);
            //    System.out.println("c = " + c);
            }

            Collections.sort(userNums);
            Collections.sort(computerNums);
            System.out.println("userNums = " + userNums);
            System.out.println("computerNums = " + computerNums);

            if (computerNums.containsAll(userNums)) {
                System.out.println("You are amazing");

            } else {
                int counter = 0;

                for (int i = 0; i < userNums.size(); i++) {

                    for (int j = 0; j < computerNums.size(); j++) {
                        if (userNums.get(i) == computerNums.get(j)) {

                            counter++;
                        }


                    }

                }
                System.out.println("Match numbers is/are =" + counter);
            }

        }

        //Example for for and do while loop
        /*
 i = 0
randomNumForUser = 12
i = 1
randomNumForUser = 14
i = 2
randomNumForUser = 3
i = 3
randomNumForUser = 7
i = 4
randomNumForUser = 3
randomNumForUser = 10
i = 5
randomNumForUser = 10
randomNumForUser = 4
userNums = [3, 4, 7, 10, 12, 14]
computerNums = [7, 8, 9, 10, 11, 12]
Match numbers is/are =3
         */
    }
}


