package apex.loops.forloop;

public class Unique {

    public static String getUniqueElements(int element) {

       String element2 = String.valueOf(element);

        String cont = "";
        for (int i = 0; i < element2.length(); i++) {
            String newelement = element2.substring(i, i + 1);
            if (element2.indexOf(newelement) == element2.lastIndexOf(newelement)) {
                cont += newelement;
            }

        }

            return cont;
    }



    public static void main(String[] args) {
        System.out.println("getUniqueElements = " + getUniqueElements(223878));
    }
}
