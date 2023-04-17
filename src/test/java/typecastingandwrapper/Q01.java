package typecastingandwrapper;

public class Q01 {
    public static void main(String[] args) {
        /*
        byte num74 = 74;
        short num97 = 97;
        int num118 = 118;
        int numNinetySeven = 97;
         */

        Character firstCharacter = (char)74;
        Character secondCharacter = (char)97;
        Character thirdCharacter = (char)118;
        Character fourthCharacter = (char) 97;

        System.out.println(firstCharacter+"" +secondCharacter+""+thirdCharacter+""+fourthCharacter);



    }
}
