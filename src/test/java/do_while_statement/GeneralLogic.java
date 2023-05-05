package do_while_statement;

import java.util.Random;

public class GeneralLogic {
    public static void main(String[] args) {

        System.out.println("******1)  when do while false it runs only once********");
        System.out.println("Before do while  " );

//        do {
//            System.out.println(("inside the loop "));
//
//        } while (false);
//
//        System.out.println("outside do while");
//
//
//
//        System.out.println("****** 2) when do while with for, and when it false it runs 6 times********");
//        for (int i = 0; i < 6; i++) {
//            System.out.println("i = " + i);
//            do {
//                System.out.println(("inside the loop "));
//
//            } while (false);
//
//            System.out.println("outside do while");
//        }
//
//        System.out.println("****** 3) another false option it runs 6 times********");
//
//        int[] arr = new int[6];
//        int randomNumber1 = 0;
//        Random random = new Random();
//        boolean isRepeated;
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println("i = " + i);
//            do {
//                isRepeated = false;
//                System.out.println("Inside do while ");
//            } while (isRepeated);
//
//            System.out.println("outside do while");
//        }

        System.out.println("***********FOR TRUE for DO WHILE********** ");

        System.out.println("****** 1) true =====> infinite means inside do while ********");
        System.out.println("****** 1) A condition or break is necessary ********");

            do {
                System.out.println("infiniti inside do while");
                break;// if we don't put break or a condition it runs infinite times
            } while (true);
        }
    }

