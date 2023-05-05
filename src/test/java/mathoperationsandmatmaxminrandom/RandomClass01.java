package mathoperationsandmatmaxminrandom;

import java.util.Random;

public class RandomClass01 {


        public static void main(String[] args) {

            System.out.println("**********MathRandom ***********");
            System.out.println("Math.random() = " + Math.random());

            System.out.println("**********1.Way From Random Class ***********");
            Random rand = new Random();
            int upperbound = 30;
            int lowerbound=2;
            int random_integer = rand.nextInt(upperbound-lowerbound) + lowerbound;
            System.out.println(random_integer);

            System.out.println("**********2.Way From Random Class ***********");
            Random r = new Random();
            int fourDigit = 1000 + r.nextInt(10000);
            System.out.println(fourDigit);

            System.out.println("**********An example Random Class ***********");
            Random r2= new Random();
            int reg=r.nextInt(10);
            System.out.println("reg = " + reg);
        }
    }

