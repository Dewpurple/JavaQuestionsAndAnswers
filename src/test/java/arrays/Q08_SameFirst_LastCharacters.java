package arrays;

public class Q08_SameFirst_LastCharacters {

    /*
    Type code to find array elements whose first and last characters are same
     */

    public static void main(String[] args) {

        String[] arr = {"alabama", "pick", "sos", "sets", "pex"};
        System.out.println("arr[0].charAt(0) = " + arr[1].charAt(arr[1].length() - 1));

        String cont = "";

        for (int i = 0; i < arr.length; i++) {


            if (arr[i].charAt(0) == arr[i].charAt(arr[i].length() - 1)) {
                cont += arr[i] + " ";

            }
        }
        System.out.println("cont = " + cont + " ");


        // first character:
        System.out.println("arr[0].charAt(0) = " + arr[0].charAt(0));
        System.out.println("arr[0].substring(0,1) = " + arr[0].substring(0, 1));
        String firstElement = arr[0].substring(0, 1);
        System.out.println("firstElement = " + firstElement);
        System.out.println("arr[0].startsWith(\"firstElement\") = " + arr[0].startsWith(firstElement));//true

        // last character:
        System.out.println("arr[0].length()-1 = " + arr[0].charAt(arr[0].length() - 1));
        System.out.println("arr[0].substring(arr[0].length()-1,arr[0].length()) = " + arr[0].substring(arr[0].length() - 1, arr[0].length()));
        String lastElement = arr[0].substring(arr[0].length() - 1, arr[0].length());
        System.out.println("arr[0].endsWith(lastElement) = " + arr[0].endsWith(lastElement));


        System.out.println();
        System.out.println("********* 2.way ***************");

        String[] sarr = {"alabama", "pick", "sos", "sets", "pex"};

        String c="";
        for (int i = 0; i < sarr.length; i++) {

            String first_First = sarr[i].substring(0, 1);
            String first_last=sarr[i].substring(arr[i].length()-1);

//            System.out.println(first_First);//a p s s p
//            System.out.println(first_last);// a k s s x

            if(sarr[i].substring(0, 1).equals(sarr[i].substring(arr[i].length()-1))){
                c+=sarr[i]+ " ";
            }


        }
        System.out.println("c = " + c);






    }
    }






