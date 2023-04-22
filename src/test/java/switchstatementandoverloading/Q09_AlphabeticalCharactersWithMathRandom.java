package switchstatementandoverloading;

public class Q09_AlphabeticalCharactersWithMathRandom {

/*
    Create a method which gives you a random alphabetical character in the Class then
    print the following by using the method.
    Print "First Character" for 'A' and 'a'
    Print "Second Character" for 'B' and 'b'
    Print "Third Character" for 'C' and 'c'
    Print "Forth Character" for 'D' and 'd'
    Print "Other Characters" for all others
 */

    public static String getRandom() {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        double randomIDX = Math.random();
     //   int alphabet = (int) (randomIDX * 10);
        int alphabet = (int) (randomIDX * str.length()-1);
        System.out.println("a = " + str.charAt(alphabet));

        switch (str.toLowerCase().charAt(alphabet)){
            case 'a':
                System.out.println("First Character");
                break;
            case 'b':
                System.out.println("Second Character");
                break;
            case 'c':
                System.out.println("Third Character");
                break;
            case 'd':
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Charcters");
                break;
        }
     //  return str.substring(alphabet, alphabet + 1);
        return str;
    }


    public static void main(String[] args) {
    getRandom();


    }
}