package arrays;

public class Q11_SumOfTheNumbersOfCharacters {
    /*
    Type code to find sum of the number of characters of array elements
    */
    public static void main(String[] args) {

        String[] arr ={"alabama", "pick", "sos", "sets", "pex"};

        int cont=0;
        for(String w: arr){
            cont+= + w.length();
        }
        System.out.println("cont = " + cont);
    }
}
